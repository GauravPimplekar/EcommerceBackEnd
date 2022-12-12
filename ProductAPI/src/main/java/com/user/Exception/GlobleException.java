package com.user.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.user.Model.MyErrorDetails;

@ControllerAdvice
public class GlobleException {

	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<MyErrorDetails> customerException(CustomerException ce, WebRequest wr){
		
		MyErrorDetails error = new MyErrorDetails();
		
		error.setLocalTime(LocalDateTime.now());
		error.setDetails(wr.getDescription(false));
		error.setMassage(ce.getMessage());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(ProductException.class)
	public ResponseEntity<MyErrorDetails> productException(ProductException pe, WebRequest wr){
		
		MyErrorDetails error = new MyErrorDetails();
		
		error.setLocalTime(LocalDateTime.now());
		error.setDetails(wr.getDescription(false));
		error.setMassage(pe.getMessage());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(PaymentException.class)
	public ResponseEntity<MyErrorDetails> paymentException(PaymentException ce, WebRequest wr){
		
		MyErrorDetails error = new MyErrorDetails();
		
		error.setLocalTime(LocalDateTime.now());
		error.setDetails(wr.getDescription(false));
		error.setMassage(ce.getMessage());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(OrderException.class)
	public ResponseEntity<MyErrorDetails> orderException(OrderException ce, WebRequest wr){
		
		MyErrorDetails error = new MyErrorDetails();
		
		error.setLocalTime(LocalDateTime.now());
		error.setDetails(wr.getDescription(false));
		error.setMassage(ce.getMessage());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(FeedBackException.class)
	public ResponseEntity<MyErrorDetails> feedbackException(FeedBackException ce, WebRequest wr){
		
		MyErrorDetails error = new MyErrorDetails();
		
		error.setLocalTime(LocalDateTime.now());
		error.setDetails(wr.getDescription(false));
		error.setMassage(ce.getMessage());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(LoginException.class)
	public ResponseEntity<MyErrorDetails> loginException(LoginException ce, WebRequest wr){
		
		MyErrorDetails error = new MyErrorDetails();
		
		error.setLocalTime(LocalDateTime.now());
		error.setDetails(wr.getDescription(false));
		error.setMassage(ce.getMessage());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(CategoryException.class)
	public ResponseEntity<MyErrorDetails> categoryException(CategoryException ce, WebRequest wr){
		
		MyErrorDetails error = new MyErrorDetails();
		
		error.setLocalTime(LocalDateTime.now());
		error.setDetails(wr.getDescription(false));
		error.setMassage(ce.getMessage());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(AdminException.class)
	public ResponseEntity<MyErrorDetails> adminException(AdminException ce, WebRequest wr){
		
		MyErrorDetails error = new MyErrorDetails();
		
		error.setLocalTime(LocalDateTime.now());
		error.setDetails(wr.getDescription(false));
		error.setMassage(ce.getMessage());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> exception(Exception ce, WebRequest wr){
		
		MyErrorDetails error = new MyErrorDetails();
		
		error.setLocalTime(LocalDateTime.now());
		error.setDetails(wr.getDescription(false));
		error.setMassage(ce.getMessage());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
