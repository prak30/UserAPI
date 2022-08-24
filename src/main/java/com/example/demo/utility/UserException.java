package com.example.demo.utility;

public class UserException extends RuntimeException {
	String message;

	public UserException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
