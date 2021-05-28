package com.project.nebulosa.ControllerAdvice;

import java.util.Date;

import javax.management.AttributeNotFoundException;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ControllerAdviceErros {
	
	@ExceptionHandler(ConfigDataResourceNotFoundException.class)
	  public ResponseEntity<ApiErros> resourceNotFoundException(AttributeNotFoundException ex, WebRequest request) {
	    ApiErros message = new ApiErros(
	        HttpStatus.NOT_FOUND.value(),
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(true));
	    
	    return new ResponseEntity<ApiErros>(message, HttpStatus.NOT_FOUND);
	  }

	  @ExceptionHandler(Exception.class)
	  public ResponseEntity<ApiErros> globalExceptionHandler(Exception ex, WebRequest request) {
		  ApiErros message = new ApiErros(
	        HttpStatus.INTERNAL_SERVER_ERROR.value(),
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ApiErros>(message, HttpStatus.INTERNAL_SERVER_ERROR);
	  }
}
