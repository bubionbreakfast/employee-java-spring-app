package com.codeclan.example.Employee;

import com.codeclan.example.Employee.models.Employee;
import com.codeclan.example.Employee.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createEmployee(){
		Employee bob = new Employee("bob", 23, 123, "bob@bobmail.com");
		employeeRepository.save(bob);
	}

}
