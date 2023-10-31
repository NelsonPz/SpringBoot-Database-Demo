package database_demo.model;

// import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String userId;
    String firstName;
    String lastName;
    String department;
    String password;
    public Employee(String userId, String firstName, String lastName, String department) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    

}
