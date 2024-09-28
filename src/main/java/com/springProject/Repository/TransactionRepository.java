package com.springProject.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springProject.Model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
	
	
	

}




