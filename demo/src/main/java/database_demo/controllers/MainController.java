package database_demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import database_demo.services.AdminService;
import database_demo.model.Employee;

@Controller
public class MainController {
    
    AdminService adminService;

    public MainController(AdminService adminService)
    {
        this.adminService = adminService;
    }

    @GetMapping("/")
    public String getRoot(Model model)
    {
        List<Employee> employees = adminService.findAll();

        model.addAttribute("employees", employees);
    
        return "employees";
    }
}
