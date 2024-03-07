package com.student.Exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestTemplate;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(value=AgeException.class)
	public ResponseEntity<Object> ageException(AgeException a){
		return new ResponseEntity<>(a.getMessage(),HttpStatus.NOT_FOUND);
	} 
	
	

}