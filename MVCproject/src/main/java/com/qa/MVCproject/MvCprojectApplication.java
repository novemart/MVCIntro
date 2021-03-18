package com.qa.MVCproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.qa.controllers"})
public class MvCprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvCprojectApplication.class, args);
	}

}
