package pe.edu.utec.labreserve.dto.request;
import jakarta.validation.constraints.*;
public record CreateOrderRequestDto(@NotNull Long productId,@NotNull @Min(1) Integer quantity) {}
