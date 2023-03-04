package com.masai.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	   @ExceptionHandler(EmployeeException.class)
	   public   ResponseEntity<MyErrorDetails> EmployeeExceptionHandler(EmployeeException ex,WebRequest wr) {
		        
		   MyErrorDetails md=new MyErrorDetails();
		   md.setMessage(ex.getMessage());
		   md.setDetails(wr.getDescription(false));
		   
		   return new ResponseEntity<>(md,HttpStatus.BAD_REQUEST);
	   }
	   
	   
	   @ExceptionHandler(Exception.class)
	   public ResponseEntity<MyErrorDetails>  AnyException(Exception ex,WebRequest wr) {
		        
		   MyErrorDetails md=new MyErrorDetails();
		   md.setMessage(ex.getMessage());
		   md.setDetails(wr.getDescription(false));
		   return new ResponseEntity<>(md,HttpStatus.BAD_REQUEST);
	   }
	   
	   @ExceptionHandler(NoHandlerFoundException.class)
	   public ResponseEntity<MyErrorDetails>  NoHandlerFound(NoHandlerFoundException ex,WebRequest wr) {
		        
		   MyErrorDetails md=new MyErrorDetails();
		   md.setMessage(ex.getMessage());
		   md.setDetails(wr.getDescription(false));
		   return new ResponseEntity<>(md,HttpStatus.BAD_REQUEST);
	   }
	   
	   
	   @ExceptionHandler(MethodArgumentNotValidException.class)
	   public ResponseEntity<MyErrorDetails>  NotValidArgs(MethodArgumentNotValidException ex,WebRequest wr) {
		        
		   MyErrorDetails md=new MyErrorDetails();
		   md.setMessage(ex.getBindingResult().getFieldError().getDefaultMessage());
		   md.setDetails(wr.getDescription(false));
		   return new ResponseEntity<>(md,HttpStatus.BAD_REQUEST);
	   }
	   
}
