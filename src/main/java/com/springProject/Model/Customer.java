package com.springProject.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="customerDetails")
public class Customer {
	
	@Id
	long accountNumber;
	@NotEmpty(message="customer name required")
	String customerName;
	@NotEmpty(message="Bank name is required")
	String bankName;
	@NotEmpty(message="Account type is required")
	String accountType;
	@NotNull
	int age;
	@NotNull
	long contactDetails;
	@NotEmpty(message="email is required")
	String email;
	@NotNull
	long amount;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, String bankName, String accountType, int age, long accountNumber,
			long contactDetails, String email, long amount) {
		super();
		this.customerName = customerName;
		this.bankName = bankName;
		this.accountType = accountType;
		this.age = age;
		this.accountNumber = accountNumber;
		this.contactDetails = contactDetails;
		this.email = email;
		this.amount = amount;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(long contactDetails) {
		this.contactDetails = contactDetails;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Admin [customerName=" + customerName + ", bankName=" + bankName + ", accountType=" + accountType
				+ ", age=" + age + ", accountNumber=" + accountNumber + ", contactDetails=" + contactDetails
				+ ", email=" + email + "]";
	}
	

}
