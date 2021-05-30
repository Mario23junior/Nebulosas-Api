package com.project.nebulosa.ControllerAdvice;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ApiErros {

	private int status;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date timestamp;
	private String message;
	private String path;
	
	public ApiErros(int status, Date timestamp, String message, String path) {
		super();
		this.status = status;
		this.timestamp = timestamp;
		this.message = message;
		this.path = path;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	

}
