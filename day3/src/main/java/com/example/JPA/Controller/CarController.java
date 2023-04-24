package com.example.JPA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.JPA.Service.CarService;
import com.example.JPA.Model.CarModel;
@RestController
public class CarController {
	@Autowired
	public CarService cser;
	@PostMapping("/saveCars")
	public CarModel addDetails(@RequestBody CarModel cr)
	{
		return cser.saveinfo(cr);
	}

}
