package pe.edu.utec.labreserve.exception;
import org.springframework.http.*; import org.springframework.web.bind.MethodArgumentNotValidException; import org.springframework.web.bind.annotation.*; import pe.edu.utec.labreserve.dto.response.ErrorResponseDto;
@RestControllerAdvice public class GlobalExceptionHandler{
 @ExceptionHandler(UserAlreadyExistsException.class) ResponseEntity<ErrorResponseDto> user(UserAlreadyExistsException e){return err(409,"Conflict",e.getMessage());}
 @ExceptionHandler(InvalidCredentialsException.class) ResponseEntity<ErrorResponseDto> auth(InvalidCredentialsException e){return err(401,"Unauthorized",e.getMessage());}
 @ExceptionHandler(StoreNotFoundException.class) ResponseEntity<ErrorResponseDto> store(StoreNotFoundException e){return err(404,"Not Found",e.getMessage());}
 @ExceptionHandler(ProductNotFoundException.class) ResponseEntity<ErrorResponseDto> product(ProductNotFoundException e){return err(404,"Not Found",e.getMessage());}
 @ExceptionHandler(InsufficientStockException.class) ResponseEntity<ErrorResponseDto> stock(InsufficientStockException e){return err(409,"Conflict",e.getMessage());}
 @ExceptionHandler(ProductNotAvailableException.class) ResponseEntity<ErrorResponseDto> unavailable(ProductNotAvailableException e){return err(409,"Conflict",e.getMessage());}
 @ExceptionHandler(ProductAlreadyExistsException.class) ResponseEntity<ErrorResponseDto> duplicateProduct(ProductAlreadyExistsException e){return err(409,"Conflict",e.getMessage());}
 @ExceptionHandler(ForbiddenStoreActionException.class) ResponseEntity<ErrorResponseDto> forbidden(ForbiddenStoreActionException e){return err(403,"Forbidden",e.getMessage());}
 @ExceptionHandler(MethodArgumentNotValidException.class) ResponseEntity<ErrorResponseDto> validation(MethodArgumentNotValidException e){return err(400,"Bad Request",e.getBindingResult().getFieldErrors().stream().findFirst().map(x->x.getField()+": "+x.getDefaultMessage()).orElse("Validation error"));}
 @ExceptionHandler(Exception.class) ResponseEntity<ErrorResponseDto> generic(Exception e){return err(500,"Internal Server Error",e.getMessage());}
 private ResponseEntity<ErrorResponseDto> err(int s,String e,String m){return ResponseEntity.status(s).body(new ErrorResponseDto(s,e,m));}
}
