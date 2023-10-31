package database_demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import database_demo.repos.EmployeeRepo;
import database_demo.model.Department;
import database_demo.model.Employee;

@Service
public class AdminService {
    
    EmployeeRepo employeeRepo;

    public AdminService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;

        Department admin = new Department("admin");
        Department sales = new Department("sales");
        Department orders = new Department("orders");
        Department repairs = new Department("repairs");

        employeeRepo.save(new Employee("abbie","Abbie","Miller","admin"));
        employeeRepo.save(new Employee("sam","Sam","Miller","sales"));
        employeeRepo.save(new Employee("olivia","Olivia","Miller","orders"));
    }

    public List<Employee> findAll()
    {
       return employeeRepo.findAll();
    }
}
