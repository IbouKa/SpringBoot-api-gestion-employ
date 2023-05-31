package com.example.labopenclassroom.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.labopenclassroom.api.model.Employee;
import com.example.labopenclassroom.api.repository.EmployeeRepository;

import lombok.Data;

@Data
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployee(final Long id){
        return employeeRepository.findById(id);
    }

    public Iterable<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    public void deleteEmployee(final Long id){
        employeeRepository.deleteById(id);
    }

    public Employee saveEmployee(Employee employee){
        Employee saveEmployee=employeeRepository.save(employee);
        return saveEmployee;
    }
}
