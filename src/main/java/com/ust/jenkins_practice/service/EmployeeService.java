package com.ust.jenkins_practice.service;

import com.ust.jenkins_practice.entity.Employee;
import com.ust.jenkins_practice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> fetchEmployees(){
        return employeeRepository.findAll();
    }


}
