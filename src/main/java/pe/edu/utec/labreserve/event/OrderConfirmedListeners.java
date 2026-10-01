package pe.edu.utec.labreserve.event;
import org.springframework.scheduling.annotation.Async; import org.springframework.stereotype.Component; import org.springframework.transaction.event.TransactionPhase; import org.springframework.transaction.event.TransactionalEventListener;
@Component public class OrderConfirmedListeners{
 @Async @TransactionalEventListener(phase=TransactionPhase.AFTER_COMMIT) public void sendConfirmation(OrderConfirmedEvent e){System.out.println("[CONFIRMATION] Order "+e.orderId()+" confirmed for customer "+e.customerId());}
 @Async @TransactionalEventListener(phase=TransactionPhase.AFTER_COMMIT) public void sendMetrics(OrderConfirmedEvent e){System.out.println("[METRICS] confirmed order="+e.orderId()+" total="+e.totalAmount());}
}
