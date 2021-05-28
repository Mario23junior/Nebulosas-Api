package com.project.nebulosa.ControllerAdvice;

import java.util.Arrays;
import java.util.List;

public class ApiErros {
   
	private List<String> erros;
	
	public ApiErros(String menssage) {
		this.erros = Arrays.asList(menssage);
 	}
	
	public ApiErros(List<String> erros) {
		this.erros = erros;
	}
	
	public List<String> getErros(){
		return erros;
	}
	
	public void setErros(List<String> erros) {
		this.erros = erros;
	}
	
}
