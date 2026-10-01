package pe.edu.utec.labreserve.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.utec.labreserve.entity.Store;
import java.util.Optional;
public interface StoreRepository extends JpaRepository<Store,Long>{Optional<Store> findById(Long id); boolean existsByName(String name);}
