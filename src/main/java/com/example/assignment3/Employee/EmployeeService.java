package com.example.assignment3.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    /* Lấy danh sách nhân viên*/
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}