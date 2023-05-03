package com.example.project1.demo;

import java.lang.ModuleLayer.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Log {
	Logger log=LoggerFactory.getLogger(Controller.class);
	@RequestMapping("/")
	public String demo() {
		log.info("Information message");
		log.warn("Warning message");
		log.error("Error message");
		log.debug("Debug message");
		log.trace("Trace message");
		
		return "Completed";	
	}
	

}
