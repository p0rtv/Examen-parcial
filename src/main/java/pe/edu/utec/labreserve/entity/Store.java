package pe.edu.utec.labreserve.entity;

import jakarta.persistence.*;

@Entity
@Table(name="stores", uniqueConstraints=@UniqueConstraint(columnNames="name"))
public class Store {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    @Column(nullable=false, unique=true) private String name;
    @Column(nullable=false) private Long ownerId;
    private String location;
    @Column(nullable=false) private String status;
    public Store() {}
    public Store(String name,Long ownerId,String location,String status){this.name=name;this.ownerId=ownerId;this.location=location;this.status=status;}
    public Long getId(){return id;} public String getName(){return name;} public Long getOwnerId(){return ownerId;} public String getLocation(){return location;} public String getStatus(){return status;}
    public void setId(Long id){this.id=id;} public void setName(String v){name=v;} public void setOwnerId(Long v){ownerId=v;} public void setLocation(String v){location=v;} public void setStatus(String v){status=v;}
}
