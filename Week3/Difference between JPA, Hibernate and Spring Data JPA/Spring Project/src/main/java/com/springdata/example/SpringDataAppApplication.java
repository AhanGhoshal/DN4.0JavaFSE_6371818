package com.springdata.example;

import com.springdata.example.entity.Employee;
import com.springdata.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataAppApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Employee emp = new Employee();
		emp.setName("Arun");
		emp.setDepartment("HR");
		service.addEmployee(emp);
	}
}
