package database_demo.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import database_demo.model.Employee;


public interface EmployeeRepo extends CrudRepository<Employee,Integer>{

    public List<Employee> findAll();
    
}
