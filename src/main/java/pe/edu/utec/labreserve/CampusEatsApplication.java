package pe.edu.utec.labreserve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class CampusEatsApplication {
    public static void main(String[] args) {
        SpringApplication.run(CampusEatsApplication.class, args);
    }
}
