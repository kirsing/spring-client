package com.example.springcloudconfigclient.controller;

import com.example.springcloudconfigclient.model.Employee;
import com.example.springcloudconfigclient.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/workflow")
public class EmployeeController {
    EmployeeRepository employeeRepository;

    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployeeById(@PathVariable int id) {
        employeeRepository.deleteById(id);
        return "Deleted";
    }



}
