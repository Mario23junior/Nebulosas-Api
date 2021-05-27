package com.project.nebulosa.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.nebulosa.Controller.Service.ServiceBaseRelato;
import com.project.nebulosa.model.BaseRelato;

@RequestMapping("/v1/api/baseRelato/")
@RestController
public class ControllerBaseRelato {
   
	private ServiceBaseRelato serviceBaseRelato;
	
	public ControllerBaseRelato(ServiceBaseRelato serviceBaseRelato) {
		this.serviceBaseRelato = serviceBaseRelato;
 	}
	
	@PostMapping
	public BaseRelato save(@RequestBody BaseRelato baseRelato) {
		 return serviceBaseRelato.salvarData(baseRelato);
	}
}
