package pe.edu.utec.labreserve.dto.request;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
public record CreateProductRequestDto(@NotBlank String name,@NotNull @DecimalMin(value="0.01") BigDecimal price,@NotNull @Min(0) Integer stock) {}
