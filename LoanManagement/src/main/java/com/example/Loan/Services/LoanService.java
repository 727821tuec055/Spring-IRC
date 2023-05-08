package com.example.Loan.Services;


import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;





import com.example.Loan.Models.LoanApplicationModel;

import com.example.Loan.Models.UserModel;

import com.example.Loan.Repositories.LoanRepo;

import com.example.Loan.Repositories.UserRepo;





@Service

public class LoanService {

	

	@Autowired

	

	public  UserRepo rep;

	

	public UserModel adduser(UserModel usmodel)

	{

	return rep.save(usmodel);

	}



	public Optional<UserModel> getUsermodelbyId(int id)

	{

	return rep.findById(id);

	}

	public UserModel update (UserModel id)

	{

	return rep.saveAndFlush(id);

	}

	public void delete(int id)

	{

	rep.deleteById(id);

	}

	

public LoanRepo repe;

	

	public LoanApplicationModel adduser(LoanApplicationModel usmodel)

	{

	return repe.save(usmodel);

	}



	public Optional<LoanApplicationModel> getLoanApplicationbyId(int loanId)

	{

	return repe.findById(loanId);

	}

	public LoanApplicationModel update (LoanApplicationModel loanId)

	{

	return repe.saveAndFlush(loanId);

	}

	public void delete1(int loanId)

	{

	repe.deleteById(loanId);

	}

	

	







}

