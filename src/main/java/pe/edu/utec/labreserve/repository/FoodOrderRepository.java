package pe.edu.utec.labreserve.repository;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.utec.labreserve.entity.FoodOrder;
public interface FoodOrderRepository extends JpaRepository<FoodOrder,Long>{Page<FoodOrder> findByCustomerId(Long customerId,Pageable pageable);}
