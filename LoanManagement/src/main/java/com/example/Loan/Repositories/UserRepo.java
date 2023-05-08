package com.example.Loan.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Loan.Models.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
