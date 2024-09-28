package com.springProject.Exception;

public class LimitExceedException extends RuntimeException {
	
	public LimitExceedException(String message){
		
		super(message);
	}

}
