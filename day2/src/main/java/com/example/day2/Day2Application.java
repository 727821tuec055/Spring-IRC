package com.example.day2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Day2Application {

	public static void main(String[] args) throws JsonProcessingException{
		SpringApplication.run(Day2Application.class, args);
		Person obj=new Person(1,"Janani",14);
		ObjectMapper obj1=new ObjectMapper();
		String str=obj1.writeValueAsString(obj);
		System.out.print(str);
		
	}

}
