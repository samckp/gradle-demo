package com.sam.gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradleDemoApplication {

	public static void main(String[] args) {

		System.out.println("Welcome Gradle !!");
		SpringApplication.run(GradleDemoApplication.class, args);
	}

}
