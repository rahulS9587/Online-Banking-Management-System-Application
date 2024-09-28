package com.springProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springProject.Model.Transaction;
import com.springProject.Repository.TransactionRepository;

@Service
public class TransactionServiceImp implements TransactionService {


	@Autowired
	TransactionRepository transactionrepository;

	@Override
	public void transa(Transaction t) {
		
		transactionrepository.save(t);
		
	}
	
	

}
