package com.example.Loan.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Loan.Models.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel, Integer> {

}
