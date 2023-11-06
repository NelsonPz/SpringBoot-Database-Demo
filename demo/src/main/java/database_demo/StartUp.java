package database_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import database_demo.model.Department;
import database_demo.model.Employee;
import database_demo.repos.DepartmentRepo;
import database_demo.repos.EmployeeRepo;

@Component
public class StartUp implements CommandLineRunner{



    EmployeeRepo employeeRepo;
    DepartmentRepo departmentRepo;

    public StartUp(EmployeeRepo employeeRepo, DepartmentRepo departmentRepo)
    {
        this.employeeRepo = employeeRepo;
        this.departmentRepo = departmentRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub

        Department admin = new Department("admin");
        Department sales = new Department("sales");
        Department orders = new Department("orders");
        Department repairs = new Department("repairs");

        departmentRepo.save(admin);
        departmentRepo.save(sales);
        departmentRepo.save(orders);
        departmentRepo.save(repairs);

        employeeRepo.save(new Employee("abbie","Abbie","Miller",admin));
        employeeRepo.save(new Employee("sam","Sam","Miller",sales));
        employeeRepo.save(new Employee("olivia","Olivia","Miller",orders));
    }
    
}
