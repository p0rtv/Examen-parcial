package pe.edu.utec.labreserve.config;
import io.jsonwebtoken.*; import io.jsonwebtoken.security.Keys; import org.springframework.beans.factory.annotation.Value; import org.springframework.stereotype.Service; import javax.crypto.SecretKey; import java.nio.charset.StandardCharsets; import java.util.Date;
@Service public class JwtService{
 @Value("${jwt.secret:404E635266556A586E3272357538782F413F4428472B4B6250645367566B5970}") private String secret; @Value("${jwt.expiration-seconds:3600}") private long exp;
 private SecretKey key(){return Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));}
 public String generateToken(Long id,String username,String role){Date now=new Date(); Date end=new Date(now.getTime()+exp*1000); return Jwts.builder().subject(username).claim("userId",id).claim("role",role).issuedAt(now).expiration(end).signWith(key()).compact();}
 public long expiration(){return exp;} public String username(String t){return claims(t).getSubject();} public Long userId(String t){Object v=claims(t).get("userId");return v instanceof Number n?n.longValue():null;} public boolean valid(String t){try{return !claims(t).getExpiration().before(new Date());}catch(Exception e){return false;}} private Claims claims(String t){return Jwts.parser().verifyWith(key()).build().parseSignedClaims(t).getPayload();}
}
