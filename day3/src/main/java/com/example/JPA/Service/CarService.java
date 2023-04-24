package com.example.JPA.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JPA.Model.CarModel;
import com.example.JPA.Repository.CarRepo;

@Service
public class CarService {

	@Autowired
	public CarRepo crepo;

	public CarModel saveinfo(CarModel cr) {
		// TODO Auto-generated method stub
		return crepo.save(cr);
	}

	public void deletedetails(int id) {
		// TODO Auto-generated method stub
		crepo.deleteById(id);
		
	}



	public Optional<CarModel> getdetails(int id) {
		// TODO Auto-generated method stub
		return crepo.findById(id);
	}

	public CarModel updatedetails(CarModel id) {
		// TODO Auto-generated method stub
		return crepo.saveAndFlush(id);
	}
	
}

