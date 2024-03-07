package com.dealer.CustomException;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value=NameNotFoundException.class)
	public ResponseEntity<Object> noName(NameNotFoundException nn){
		return new ResponseEntity<>(nn.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=IdNotFoundException.class)
	public ResponseEntity<Object> noId(IdNotFoundException in){
		return new ResponseEntity<>(in.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=ProductNotFoundException.class)
	public ResponseEntity<Object> noProduct(ProductNotFoundException np){
		return new ResponseEntity<>(np.getMessage(),HttpStatus.NOT_FOUND);
	}
 	

}
