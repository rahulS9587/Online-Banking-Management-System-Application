package com.springProject.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandlerException {
	
	@ExceptionHandler(AccountNotFoundException.class)
	public ResponseEntity<?> account(AccountNotFoundException account){
		
		ErrorDetails errordetails = new ErrorDetails(account.getMessage(), 404);

		
		return new ResponseEntity<>(errordetails,HttpStatus.NOT_FOUND);	
	}
	
	@ExceptionHandler(MinimumBalanceException.class)
	public ResponseEntity<?> minimum( MinimumBalanceException min){
		
		ErrorDetails errordetails = new ErrorDetails(min.getMessage(), 400);

		
		return new ResponseEntity<>(errordetails,HttpStatus.BAD_REQUEST);	
		
	}
	
	@ExceptionHandler(LimitExceedException.class)
	public ResponseEntity<?> exceed( LimitExceedException limit){
		
		ErrorDetails errordetails = new ErrorDetails(limit.getMessage(), 400);

		
		return new ResponseEntity<>(errordetails,HttpStatus.BAD_REQUEST);
		
		
		
		
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ErrorDetails validatingError(MethodArgumentNotValidException valid) {
		ErrorDetails error = new ErrorDetails();
		valid.getBindingResult().getAllErrors().forEach(ex -> {
			int Status = HttpStatus.BAD_REQUEST.value();
			error.setStatuscode(Status);
			String Message = ex.getDefaultMessage();
			error.setMessage(Message);

		});
		return error;
	}
	
	
	
	
	

}
