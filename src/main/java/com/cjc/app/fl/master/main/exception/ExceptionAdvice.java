package com.cjc.app.fl.master.main.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdvice 
{
	@ExceptionHandler(CustomerServiceException.class)
	public ResponseEntity<CustomerEnquiryError> abc(CustomerServiceException cse)
	{
		CustomerEnquiryError c_error = new CustomerEnquiryError(HttpStatus.INTERNAL_SERVER_ERROR.value(), cse.getMessage());
		
		return new ResponseEntity<CustomerEnquiryError>(c_error,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	
	

}
