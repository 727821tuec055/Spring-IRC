package com.example.project1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1.Model.QModel;
import com.example.project1.Repository.QRepo;

@RestController
public class QController 
{
	@Autowired
	QRepo rep;
	
	//posting the given details
	@PostMapping("/post")
	public String adddetails(@RequestBody QModel ques)
	{
		rep.save(ques);
		return "Details saved successfully";
	}
}
