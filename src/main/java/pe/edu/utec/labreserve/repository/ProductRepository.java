package pe.edu.utec.labreserve.repository;

import jakarta.persistence.LockModeType;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import pe.edu.utec.labreserve.entity.Product;
import java.math.BigDecimal;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Long>{
 boolean existsByStoreIdAndName(Long storeId,String name);
 @Query("select p from Product p where p.status='AVAILABLE' and (:storeId is null or p.storeId=:storeId) and (:maxPrice is null or p.price<=:maxPrice)")
 Page<Product> findAvailable(@Param("storeId") Long storeId,@Param("maxPrice") BigDecimal maxPrice,Pageable pageable);
 @Lock(LockModeType.PESSIMISTIC_WRITE)
 @Query("select p from Product p where p.id=:id")
 Optional<Product> findByIdForUpdate(@Param("id") Long id);
}
