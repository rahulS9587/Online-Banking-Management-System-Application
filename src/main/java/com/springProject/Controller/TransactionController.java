package com.springProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springProject.Model.Transaction;
import com.springProject.Repository.TransactionRepository;
import com.springProject.Service.TransactionService;

@RestController
@RequestMapping("/v1")
public class TransactionController {
	
	@Autowired
	TransactionService transactionservice;
	
	@Autowired 
	TransactionRepository transactionrepository;
	
	
	@PostMapping("/trans")
	
	public void trans(@RequestBody Transaction transaction) {
	    
		transactionservice.transa(transaction);

}
}