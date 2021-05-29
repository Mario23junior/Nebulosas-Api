package com.project.nebulosa.Exception;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = -825867160069136651L;
    
	public ResourceNotFoundException(String msg) {
		super(msg);
	}

}
