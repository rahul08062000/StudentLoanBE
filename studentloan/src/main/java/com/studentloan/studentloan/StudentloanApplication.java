package com.studentloan.studentloan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class StudentloanApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentloanApplication.class, args);
		System.out.println("Hello Word");
	}

}
