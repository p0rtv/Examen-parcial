package pe.edu.utec.labreserve.service;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

class OrderCalculationTest {
 @Test void calculatesTotal(){ BigDecimal price=new BigDecimal("18.50"); int qty=2; assertEquals(new BigDecimal("37.00"),price.multiply(BigDecimal.valueOf(qty))); }
 @Test void insufficientStock(){ int stock=1; int qty=2; assertTrue(qty>stock); }
}
