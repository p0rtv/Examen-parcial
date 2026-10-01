package pe.edu.utec.labreserve.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.utec.labreserve.entity.User;
import java.util.Optional;
public interface UserRepository extends JpaRepository<User,Long>{Optional<User> findByUsername(String username); boolean existsByUsername(String username); boolean existsByEmail(String email);}
