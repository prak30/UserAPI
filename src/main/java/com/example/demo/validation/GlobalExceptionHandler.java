package com.example.demo.validation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.utility.Response;
import com.example.demo.utility.UserException;





@ControllerAdvice
public class GlobalExceptionHandler  {
	@ExceptionHandler(value=UserException.class)
	public ResponseEntity<Response> exceptionHandler(UserException userException){
		Response res = new Response(userException.getMessage(), 400, null);
		return new ResponseEntity<>(res, HttpStatus.BAD_REQUEST);
	}
	

}
