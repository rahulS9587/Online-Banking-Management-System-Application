package com.springProject.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springProject.Exception.ResourceNotFoundException;
import com.springProject.Model.Customer;
import com.springProject.Service.RestTempalateService;

@RestController
@RequestMapping("/v2")
public class RestTempalateController {

	@Autowired
	private RestTempalateService resttempalateservice;

	//@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/getAll")
	public ResponseEntity<String> getAllCustomers() {
		return resttempalateservice.GetAllCustomers();

	}
	@PostMapping("addcust")
	public ResponseEntity<Customer> addCustomer(@Valid @RequestBody Customer customer){
		return resttempalateservice.addCustomer(customer);
	}
	
	@GetMapping("fetch/{accountNumber}")
	public Customer getcustomerByaccountNumber(@PathVariable("accountNumber") long accountNumber) {
		return resttempalateservice.getCustomerByaccountNumber(accountNumber);
	}
	@PutMapping("/update")
	public void UpdateCustomer(@Valid @RequestBody Customer customer)
			throws ResourceNotFoundException{
		 resttempalateservice.UpdateCustomer(customer);
	}
	@DeleteMapping("/del/{accountNumber}")
		public void deleteCustomer(@PathVariable("accountNumber") long accountNumber) {
		resttempalateservice.deleteCustomer(accountNumber);
	}
	
	}

