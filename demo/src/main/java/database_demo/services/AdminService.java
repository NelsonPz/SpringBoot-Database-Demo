package database_demo.services;

import java.util.List;

import database_demo.repos.EmployeeRepo;

import database_demo.model.Employee;


public class AdminService {
    
    EmployeeRepo employeeRepo;

    public AdminService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<Employee> findAll()
    {
       return employeeRepo.findAll();
    }
}
