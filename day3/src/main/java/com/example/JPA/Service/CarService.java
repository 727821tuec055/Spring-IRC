package com.example.JPA.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JPA.Model.CarModel;
import com.example.JPA.Repository.CarRepo;

@Service
public class CarService {

	@Autowired
	public CarRepo crepo;
	public CarModel saveinfo(CarModel c)
	{
		return crepo.save(c);
	}
}
