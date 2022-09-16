package com.infy.customer.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ApplicationExceptionHandler {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
		Map<String, String> errorMap = new HashMap<>();
		errorMap.put("message",ex.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<>(errorMap,HttpStatus.FORBIDDEN);
	}
}
