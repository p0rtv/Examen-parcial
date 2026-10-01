package pe.edu.utec.labreserve.service;
import org.springframework.security.authentication.*;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder; import org.springframework.stereotype.Service; import org.springframework.transaction.annotation.Transactional; import pe.edu.utec.labreserve.config.JwtService; import pe.edu.utec.labreserve.dto.request.*; import pe.edu.utec.labreserve.dto.response.*; import pe.edu.utec.labreserve.entity.*; import pe.edu.utec.labreserve.exception.*; import pe.edu.utec.labreserve.repository.UserRepository;
@Service public class AuthService{private final UserRepository users; private final PasswordEncoder encoder; private final AuthenticationManager auth; private final JwtService jwt; public AuthService(UserRepository users,PasswordEncoder encoder,AuthenticationManager auth,JwtService jwt){this.users=users;this.encoder=encoder;this.auth=auth;this.jwt=jwt;}
 @Transactional public RegisterResponseDto register(RegisterRequestDto r){if(users.existsByUsername(r.username())||users.existsByEmail(r.email()))throw new UserAlreadyExistsException(); User u=users.save(new User(r.username(),r.email(),encoder.encode(r.password()),RoleConstants.ROLE_CUSTOMER)); return new RegisterResponseDto(u.getId(),u.getUsername(),u.getEmail());}
 public LoginResponseDto login(LoginRequestDto r){try{auth.authenticate(new UsernamePasswordAuthenticationToken(r.username(),r.password()));}catch(
         AuthenticationException e){throw new InvalidCredentialsException();} User u=users.findByUsername(r.username()).orElseThrow(InvalidCredentialsException::new); return new LoginResponseDto(jwt.generateToken(u.getId(),u.getUsername(),u.getRole()),jwt.expiration());}
}
