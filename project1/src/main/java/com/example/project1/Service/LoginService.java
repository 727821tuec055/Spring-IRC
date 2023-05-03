package com.example.project1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project1.Model.LoginModel;
import com.example.project1.Repository.LoginRepo;
@Service
public class LoginService {
	@Autowired
	private LoginRepo repol;
	public String checkLogin(String name, String pwd)
	 {
		 LoginModel user=repol.findByname(name);
				 if(user==null)
				 {
					 return "No User Found";
				 }
				 else
				 {
					 if(user.getPwd().equals(pwd))
					 {
						 return "Login Successfully";
					 }
					 else
					 {
						 return "Login Failed";
					 }
				 }
	 }
	 
		public LoginModel adduser(LoginModel cycle)
		{
			return repol.save(cycle);
		}
		public List<LoginModel>getuser()
		{
			return repol.findAll();
		}

		public LoginModel adddetails(LoginModel id) {
			// TODO Auto-generated method stub
			return repol.save(id);
		}
		
		}

