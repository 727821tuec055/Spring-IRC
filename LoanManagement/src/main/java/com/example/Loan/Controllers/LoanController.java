package com.example.Loan.Controllers;


import com.example.Loan.Services.LoanService;


import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



import com.example.Loan.Models.LoanApplicationModel;

import com.example.Loan.Models.UserModel;

@RestController

@RequestMapping("/user")

public class LoanController {

	@Autowired

	public LoanService ser;


	@GetMapping("/ad")



    public Optional<UserModel>  readbyid(@PathVariable("id")int id)

    {

   	 return ser.getUsermodelbyId(id);

    }

	

	@PostMapping("/id")

    public UserModel create(@RequestBody UserModel id)

    {

   	 return ser.adduser(id);

    }


	 @PutMapping("/id")

     public UserModel update(@RequestBody UserModel id)



     {

    	 return ser.update(id);

     }


          @DeleteMapping("/delet")

     public String delete(@PathVariable("id")int id)

     {

    	 ser.delete(id);



    	 return "Deletion was successful";

     }

          @PostMapping("/lid")

          public LoanApplicationModel create(@RequestBody LoanApplicationModel loanId)

          {

         	 return ser.adduser(loanId);

          }

      	 @PutMapping("/lid")

           public LoanApplicationModel update(@RequestBody LoanApplicationModel loanId)

           {

          	 return ser.update(loanId);

           }

            @DeleteMapping("/delete")

           public String delete1(@PathVariable("loanId")int loanId)

           {

          	 ser.delete(loanId);

          	 return "Deletion was successful";

           }



            @GetMapping("/ladd")

            

            public Optional<LoanApplicationModel>  readbyid1(@PathVariable("loanId")int loanId)

            {

            	return ser.getLoanApplicationbyId(loanId);

            }

              



}