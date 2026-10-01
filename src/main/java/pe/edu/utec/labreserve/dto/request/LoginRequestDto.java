package pe.edu.utec.labreserve.dto.request;
import jakarta.validation.constraints.NotBlank;
public record LoginRequestDto(@NotBlank String username,@NotBlank String password) {}
