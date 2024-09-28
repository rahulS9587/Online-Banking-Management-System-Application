package com.springProject;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.springProject.Model.Customer;
import com.springProject.Repository.CustomerRepository;
import com.springProject.Service.CustomerService;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {
	
	@Autowired
	CustomerService customerservice;
	
	
	@MockBean
	CustomerRepository customerRepository;
	List<Customer> customerList;
	
	Customer customer1;
	Customer customer2;
	
	@BeforeEach()
	void setUp()
	{
		customer1= new Customer("abc","xyz","current",24,2345,9598888,"ab@gmail.com",2000);
		customer2= new Customer("xyz","union Bank","saving",23,1234,95872977,"abc@gmail.com",2000);
	}
	
	@Test
	void testCustomer()
	{
		customerRepository.save(customer1);
	}
	
	
	@Test
	public void getCustomerTest() {
		when(customerRepository.findAll())
		.thenReturn((List<Customer>) Stream.of(new Customer("ramu","union Bank","saving",23,1234,95872977,"abc@gmail.com",2000),new Customer("ramu","union Bank","saving",23,1234,95872977,"abc@gmail.com",2000)).collect(Collectors.toList()));
		assertEquals(2,customerservice.fetchAllCustomers().size());
		
	}
	/*
	 * @Test public void getCustomerBycustomerNameTest() { String
	 * customerName="ram";
	 * when(customerRepository.findByCustomerName(customerName)).thenReturn((
	 * Customer) Stream.of(new
	 * Customer("ramu","union Bank","saving",23,1234,95872977,"abc@gmail.com",2000))
	 * .collect(Collectors.toList())); // assertEquals(1,
	 * customerservice.findByCustomerName(customerName).size());
	 * 
	 * 
	 * 
	 * }
	 */

	/*
	 * @Test public void addCustomertest() { Customer customer=new
	 * Customer("alex","xyz","current",24,2345,9598888,"ab@gmail.com",2000);
	 * when(customerRepository.save(customer)).thenReturn(customer);
	 * //assertEquals(1, customerservice.addCustomer(customer));
	 * //assertEquals(customer, customerservice.addCustomer(customer));
	 * 
	 * 
	 * }
	 */	
public void deletecustomerTest() {
	
	}

	

}
