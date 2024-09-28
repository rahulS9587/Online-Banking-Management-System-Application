package com.springProject.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.springProject.Exception.ResourceNotFoundException;
import com.springProject.Model.Customer;

@Service
public class RestTempalateService {
	
	
	 RestTemplate resttemplate=new RestTemplate();
		public static final String Get_All_Customers_URL="http://localhost:8888/v1/customer";
		public static final String add_Customer_URL="http://localhost:8888/v1/add";
		public static final String get_CustomerBy_accountNumber_URL="http://localhost:8888/v1/get/{accountNumber}";
		public static final String update_Customer_URL="http://localhost:8888/v1/customer";
		public static final String delete_Customer_URL="http://localhost:8888/v1/delete/{accountNumber}";




	public ResponseEntity<String> GetAllCustomers() {
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity=new HttpEntity<String>("parameters",headers);	
		ResponseEntity<String> response=resttemplate.exchange(Get_All_Customers_URL,HttpMethod.GET,entity,String.class);
		return response;	
	}
	public ResponseEntity<Customer> addCustomer(Customer customer){
	return	resttemplate.postForEntity(add_Customer_URL, customer, Customer.class);
		
	}
	public Customer getCustomerByaccountNumber(long accountNumber){
		Map<String, Long> account=new HashMap<String, Long>();
		account.put("accountNumber",  accountNumber);
		return resttemplate.getForObject(get_CustomerBy_accountNumber_URL, Customer.class, account);
	}
	public void UpdateCustomer(  Customer customer) {
	//	Map<String, Long> account=new HashMap<String, Long>();
	//	account.put("accountNumber",  accountNumber);
		 resttemplate.put(update_Customer_URL, customer);
	}
	public void deleteCustomer(long accountNumber) {
		Map<String, Long> account=new HashMap<String, Long>();
		account.put("accountNumber", accountNumber);
		resttemplate.delete(delete_Customer_URL, account);
	}
	

}
