package com.example.Loan.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Loan.Models.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel, Integer> {

}
