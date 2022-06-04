package com.jala.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.jala.crud.controller.UserController;
import com.jala.crud.service.UserServiceIMPL;

@SpringBootApplication
@ComponentScan(basePackageClasses = { UserController.class, UserServiceIMPL.class })
public class JalaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(JalaWebApplication.class, args);
	}

}