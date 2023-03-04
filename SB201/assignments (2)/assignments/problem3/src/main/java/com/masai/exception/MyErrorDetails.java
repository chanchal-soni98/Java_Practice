package com.masai.exception;

import java.time.LocalDateTime;

public class MyErrorDetails {

	private final LocalDateTime timestamp=LocalDateTime.now();
	private String message;
	private String Details;
	
	
	public MyErrorDetails(String message, String details) {
		this.message = message;
		Details = details;
	}


	public MyErrorDetails() {
		
	}
	
	


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getDetails() {
		return Details;
	}


	public void setDetails(String details) {
		Details = details;
	}


	public LocalDateTime getTimestamp() {
		return timestamp;
	}


	@Override
	public String toString() {
		return "MyErrorDetails [timestamp=" + timestamp + ", message=" + message + ", Details=" + Details + "]";
	}
	
	
	
	
}
