package com.example.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		 info =@Info(
		 title = "OneToOne",
		 version = "1.1.2",
		 description = "OneToOne Project",
		 contact = @Contact(
		 name = "Janani",
		 email = "jananiseenu17@gmail.com"
		 )
		 )
		 )
public class OneToOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}

}
