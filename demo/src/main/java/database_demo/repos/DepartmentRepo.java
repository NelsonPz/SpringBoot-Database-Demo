package database_demo.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import database_demo.model.Department;


public interface DepartmentRepo extends CrudRepository<Department,Integer> {

    public List<Department> findAll();

    
}
