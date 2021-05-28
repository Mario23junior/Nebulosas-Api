package com.project.nebulosa.ControllerAdvice;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ApiErros {

	private int statusCode;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date timestamp;	
	private String message;
	private String description;

	public ApiErros(int statusCode, Date timestamp, String message, String description) {
		this.statusCode = statusCode;
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDescription() {
		return description;
	}

}
