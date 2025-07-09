package com.springdata.example.service;

import com.springdata.example.entity.Employee;
import com.springdata.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;


@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    @Transactional
    public void addEmployee(Employee employee) {
        repository.save(employee);
    }
}
