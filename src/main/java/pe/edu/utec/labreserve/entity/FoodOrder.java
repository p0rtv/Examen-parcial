package pe.edu.utec.labreserve.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Table(name="food_orders")
public class FoodOrder {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    @Column(nullable=false) private Long customerId;
    @Column(nullable=false) private Long productId;
    @Column(nullable=false) private Integer quantity;
    @Column(nullable=false, precision=12, scale=2) private BigDecimal totalAmount;
    @Column(nullable=false) private ZonedDateTime createdAt;
    @Column(nullable=false) private String status;
    public FoodOrder() {}
    public FoodOrder(Long customerId,Long productId,Integer quantity,BigDecimal totalAmount,ZonedDateTime createdAt,String status){this.customerId=customerId;this.productId=productId;this.quantity=quantity;this.totalAmount=totalAmount;this.createdAt=createdAt;this.status=status;}
    public Long getId(){return id;} public Long getCustomerId(){return customerId;} public Long getProductId(){return productId;} public Integer getQuantity(){return quantity;} public BigDecimal getTotalAmount(){return totalAmount;} public ZonedDateTime getCreatedAt(){return createdAt;} public String getStatus(){return status;}
    public void setId(Long id){this.id=id;} public void setCustomerId(Long v){customerId=v;} public void setProductId(Long v){productId=v;} public void setQuantity(Integer v){quantity=v;} public void setTotalAmount(BigDecimal v){totalAmount=v;} public void setCreatedAt(ZonedDateTime v){createdAt=v;} public void setStatus(String v){status=v;}
}
