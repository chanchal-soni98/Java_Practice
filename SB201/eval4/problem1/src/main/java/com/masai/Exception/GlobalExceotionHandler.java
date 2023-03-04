package com.masai.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceotionHandler {
	
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<MyErrorDetails> myIllegalHandler(StudentException ie, WebRequest rq){
		
		MyErrorDetails er = new MyErrorDetails(LocalDateTime.now(),ie.getMessage(),rq.getDescription(false));
		
		ResponseEntity<MyErrorDetails> re = new ResponseEntity<>(er,HttpStatus.BAD_REQUEST);
		return re;
	}
	
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<MyErrorDetails> myExceptionHandler(Exception e, WebRequest rq){
		
		MyErrorDetails er = new MyErrorDetails(LocalDateTime.now(),e.getMessage(),rq.getDescription(false));
		
		ResponseEntity<MyErrorDetails> re = new ResponseEntity<>(er,HttpStatus.BAD_REQUEST);
		return re;
	}

}
