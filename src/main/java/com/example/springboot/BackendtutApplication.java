package com.example.springboot;

import com.example.springboot.models.Employee;
import com.example.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendtutApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BackendtutApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//
//		Employee employee=new Employee();
//		employee.setName("Akil");
//		employee.setEmail("akil@gmail.com");
//		employee.setCountry("IN");
//		employeeRepository.save(employee);
//
//
//		Employee employee1=new Employee();
//		employee1.setName("Madhavan");
//		employee1.setEmail("maddy@gmail.com");
//		employee1.setCountry("IN");
//		employeeRepository.save(employee1);

	}
}
