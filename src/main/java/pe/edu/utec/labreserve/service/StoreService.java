package pe.edu.utec.labreserve.service;
import org.springframework.stereotype.Service; import pe.edu.utec.labreserve.entity.Store; import pe.edu.utec.labreserve.exception.StoreNotFoundException; import pe.edu.utec.labreserve.repository.StoreRepository;
@Service public class StoreService{private final StoreRepository repo; public StoreService(StoreRepository repo){this.repo=repo;} public Store get(Long id){return repo.findById(id).orElseThrow(()->new StoreNotFoundException("storeId: "+id));}}
