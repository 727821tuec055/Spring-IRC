package com.example.project1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project1.Model.CycleModel;
import com.example.project1.Repository.CycleRepo;


@Service
public class CycleService {
	@Autowired
	public CycleRepo crepo;

	public CycleModel saveinfo(CycleModel cr) {
		// TODO Auto-generated method stub
		return crepo.save(cr);
	}

	public void deletedetails(int id) {
		// TODO Auto-generated method stub
		crepo.deleteById(id);
	}

	public java.util.Optional<CycleModel> getdetails(int id) {
	return crepo.findById(id);
	}

	public CycleModel updatedetails(CycleModel id) {
		// TODO Auto-generated method stub
		return crepo.saveAndFlush(id);
	}

}
