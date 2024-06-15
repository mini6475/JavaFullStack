package com.pes.MyLab20;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MyLabApllication implements CommandLineRunner{
	@Autowired
	EmployeeDao employeeDao;
	

	public static void main(String[] args) {
		SpringApplication.run(MyLabApllication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee c= new Employee(1,"Anya","abcd",6005726241L);
		employeeDao.save(c);
		System.out.println("lab1 Doen");
	}

}