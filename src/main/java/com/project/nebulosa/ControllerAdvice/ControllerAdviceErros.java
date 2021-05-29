package com.project.nebulosa.ControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.google.common.net.HttpHeaders;

@RestControllerAdvice
public class ControllerAdviceErros extends ResponseEntityExceptionHandler{
	
	   protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
	        List<ErrorObject> errors = getErrors(ex);
	        ApiErros errorResponse = getErrorResponse(ex, status, errors);
	        return new ResponseEntity<>(errorResponse, status);
	    }

	    private ApiErros getErrorResponse(MethodArgumentNotValidException ex, HttpStatus status, List<ErrorObject> errors) {
	        return new ApiErros("Requisição possui campos inválidos", status.value(),
	                status.getReasonPhrase(), ex.getBindingResult().getObjectName(), errors);
	    }

	    private List<ErrorObject> getErrors(MethodArgumentNotValidException ex) {
	        return ex.getBindingResult().getFieldErrors().stream()
	                .map(error -> new ErrorObject(error.getDefaultMessage(), error.getField(), error.getRejectedValue()))
	                .collect(Collectors.toList());
	    }
}

