package pe.edu.utec.labreserve.dto.response;
import java.math.BigDecimal;
public record ProductResponseDto(Long id,String storeName,String name,BigDecimal price,Integer stock,String status) {}
