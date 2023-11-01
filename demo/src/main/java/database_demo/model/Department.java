package database_demo.model;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Department {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;
    @OneToMany(mappedBy = "department")
    List<Employee> employees;

    //http://localhost:8080/h2-console
    // jdbc:h2:mem:testdb
    public Department(String name)
    {
        this.name = name;
    }

}
