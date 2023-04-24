package com.example.JPA.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.JPA.Service.CarService;
import com.example.JPA.Model.CarModel;
@RestController
public class CarController {
	@Autowired
	public CarService cser;
	
	//post the details
	@PostMapping("/saveCars")
	public CarModel addDetails(@RequestBody CarModel cr)
	{
		return cser.saveinfo(cr);
	}
	
	//Delete
	@DeleteMapping("/saveCars/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		cser.deletedetails(id);
		return "Deletion is Successful";
	}
	//get the details
	@GetMapping("/saveCars/{id}")
	public Optional<CarModel> getdetails(@PathVariable("id")int id)
	{
		return cser.getdetails(id);
	}
	//update the given details
	@PutMapping("/update")
	public CarModel updatedetails(@RequestBody CarModel id)
	{
		return cser.updatedetails(id);
	}
}
