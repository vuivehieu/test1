package com.example.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test1Application implements CommandLineRunner {

	@Autowired
	private EmployeeManager employeeManager;

	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		employeeManager.addNew("Hieu", "Ha Noi");
	}
}
