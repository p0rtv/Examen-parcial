package pe.edu.utec.labreserve.config;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import pe.edu.utec.labreserve.entity.User;
import java.util.Collection;
import java.util.List;
public class UserPrincipal implements UserDetails{
 private final User user; public UserPrincipal(User user){this.user=user;} public Long getId(){return user.getId();} public String getUsername(){return user.getUsername();} public String getPassword(){return user.getPassword();} public Collection<? extends GrantedAuthority> getAuthorities(){return List.of(new SimpleGrantedAuthority(user.getRole()));} public boolean isAccountNonExpired(){return true;} public boolean isAccountNonLocked(){return true;} public boolean isCredentialsNonExpired(){return true;} public boolean isEnabled(){return true;}
}
