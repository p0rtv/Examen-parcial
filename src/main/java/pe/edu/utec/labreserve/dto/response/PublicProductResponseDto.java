package pe.edu.utec.labreserve.dto.response;
import java.math.BigDecimal;
public record PublicProductResponseDto(Long id,String storeName,String name,BigDecimal price) {}
