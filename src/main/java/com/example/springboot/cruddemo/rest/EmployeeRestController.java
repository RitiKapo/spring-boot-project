package com.example.springboot.cruddemo.rest;

import com.example.springboot.cruddemo.dao.EmployeeDAO;
import com.example.springboot.cruddemo.entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeDAO employeeDAO;

    // inject employee dao directly (use constructor injection)
    public EmployeeRestController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    // expose "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeDAO.findAll();
    }
}
