package com.example.project1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.project1.Model.LoginModel;
public interface LoginRepo extends JpaRepository<LoginModel, Integer> {
	LoginModel findByname(String name);

}
