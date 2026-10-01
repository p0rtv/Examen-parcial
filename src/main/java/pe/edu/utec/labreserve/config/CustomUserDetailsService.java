package pe.edu.utec.labreserve.config;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;
import pe.edu.utec.labreserve.repository.UserRepository;
@Service public class CustomUserDetailsService implements UserDetailsService{private final UserRepository repo; public CustomUserDetailsService(UserRepository repo){this.repo=repo;} public UserDetails loadUserByUsername(String username)throws UsernameNotFoundException{return new UserPrincipal(repo.findByUsername(username).orElseThrow(()->new UsernameNotFoundException("User not found")));}}
