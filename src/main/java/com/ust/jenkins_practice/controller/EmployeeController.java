package com.ust.jenkins_practice.controller;

import com.ust.jenkins_practice.entity.Employee;
import com.ust.jenkins_practice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getAll")
    public List<Employee> fetchEmployees(){
        return employeeService.fetchEmployees();
    }
    @PostMapping("/saveEmployee")
    public Employee saveEmployee(Employee employee){
        return employeeService.saveEmployee(employee);
    }

}
