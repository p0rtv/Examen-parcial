package pe.edu.utec.labreserve.event;
public record OrderConfirmedEvent(Long orderId,Long customerId,java.math.BigDecimal totalAmount) {}
