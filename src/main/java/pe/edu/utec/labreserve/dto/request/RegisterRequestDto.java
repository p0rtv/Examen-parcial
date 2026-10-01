package pe.edu.utec.labreserve.dto.request;
import jakarta.validation.constraints.*;
public record RegisterRequestDto(@NotBlank String username,@NotBlank @Email String email,@NotBlank @Size(min=8) String password) {}
