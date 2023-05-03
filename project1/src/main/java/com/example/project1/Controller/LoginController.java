package com.example.project1.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1.Model.LoginModel;
import com.example.project1.Service.LoginService;
@RestController
public class LoginController {
	@Autowired
	private LoginService service;
	
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> logindata)
	{
		String name=logindata.get("name");
		String pwd=logindata.get("pwd");
		String result=service.checkLogin(name, pwd);
		return result;
		
	}
	
	//posting the details 
	@PostMapping("/post")
	public LoginModel adddetails(@RequestBody LoginModel id)
	{
		return service.adddetails(id);
	}
	
	
	

}
