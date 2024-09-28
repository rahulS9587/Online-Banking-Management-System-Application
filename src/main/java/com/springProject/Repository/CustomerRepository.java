package com.springProject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springProject.Model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	public Optional<Customer> findByAccountNumber(long accountNumber);
	public void deleteByaccountNumber(long accountNumber);
	public Customer findByCustomerName(String customerName);
	
	
	
	



}
