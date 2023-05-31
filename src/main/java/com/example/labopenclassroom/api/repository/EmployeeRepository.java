package com.example.labopenclassroom.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.labopenclassroom.api.model.Employee;

@Repository
public interface  EmployeeRepository extends CrudRepository<Employee, Long>{
    
}
