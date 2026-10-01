package pe.edu.utec.labreserve.dto.response;
import java.math.BigDecimal;
public record OrderResponseDto(Long id,Long productId,String customerUsername,Integer quantity,BigDecimal totalAmount,String status) {}
