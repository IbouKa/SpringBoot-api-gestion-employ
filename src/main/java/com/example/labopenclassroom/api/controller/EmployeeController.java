package com.example.labopenclassroom.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.labopenclassroom.api.model.Employee;
import com.example.labopenclassroom.api.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public Iterable<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @PutMapping("/employee")
    public Employee creatEmployee(Employee em){
        return employeeService.saveEmployee(em);
    }


}
