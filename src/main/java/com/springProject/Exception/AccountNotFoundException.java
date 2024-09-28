package com.springProject.Exception;

public class AccountNotFoundException extends RuntimeException {
	
	public AccountNotFoundException(String message){
		
		super(message);
	}

}
