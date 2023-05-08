package com.example.Loan.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Loan.Models.LoanApplicationModel;

public interface LoanRepo extends JpaRepository<LoanApplicationModel, Integer> {

}
