package pe.edu.utec.labreserve.entity;

import jakarta.persistence.*;

@Entity
@Table(name="users", uniqueConstraints={@UniqueConstraint(columnNames="username"), @UniqueConstraint(columnNames="email")})
public class User {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    @Column(nullable=false, unique=true) private String username;
    @Column(nullable=false, unique=true) private String email;
    @Column(nullable=false) private String password;
    @Column(nullable=false) private String role;
    public User() {}
    public User(String username,String email,String password,String role){this.username=username;this.email=email;this.password=password;this.role=role;}
    public Long getId(){return id;} public String getUsername(){return username;} public String getEmail(){return email;} public String getPassword(){return password;} public String getRole(){return role;}
    public void setId(Long id){this.id=id;} public void setUsername(String v){username=v;} public void setEmail(String v){email=v;} public void setPassword(String v){password=v;} public void setRole(String v){role=v;}
}
