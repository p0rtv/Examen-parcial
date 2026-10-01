package pe.edu.utec.labreserve.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="products", uniqueConstraints=@UniqueConstraint(columnNames={"store_id","name"}))
public class Product {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    @Column(name="store_id", nullable=false) private Long storeId;
    @Column(nullable=false) private String name;
    @Column(nullable=false, precision=12, scale=2) private BigDecimal price;
    @Column(nullable=false) private Integer stock;
    @Column(nullable=false) private String status;
    public Product() {}
    public Product(Long storeId,String name,BigDecimal price,Integer stock,String status){this.storeId=storeId;this.name=name;this.price=price;this.stock=stock;this.status=status;}
    public Long getId(){return id;} public Long getStoreId(){return storeId;} public String getName(){return name;} public BigDecimal getPrice(){return price;} public Integer getStock(){return stock;} public String getStatus(){return status;}
    public void setId(Long id){this.id=id;} public void setStoreId(Long v){storeId=v;} public void setName(String v){name=v;} public void setPrice(BigDecimal v){price=v;} public void setStock(Integer v){stock=v;} public void setStatus(String v){status=v;}
}
