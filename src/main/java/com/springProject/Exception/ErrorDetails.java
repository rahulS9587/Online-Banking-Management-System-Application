package com.springProject.Exception;

public class ErrorDetails {
	
	String message;
	
	int statuscode;

	public ErrorDetails() {
		super();
	}

	public ErrorDetails(String message, int statuscode) {
		super();
		this.message = message;
		this.statuscode = statuscode;
	}

	public String getMessage() {
		return message;
	}

	public int getStatuscode() {
		return statuscode;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	
	
}
