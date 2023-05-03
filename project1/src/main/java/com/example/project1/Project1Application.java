package com.example.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		 info =@Info(
		 title = "MaX Games",
		 version = "1.1.2",
		 description = "Game Hub Project",
		 contact = @Contact(
		 name = "MaX",
		 email = "kratos@max.io"
		 )
		 )
		 )
public class Project1Application {

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
	}

}
