package com.project.nebulosa.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.nebulosa.Controller.Service.ServiceNebulosa;
import com.project.nebulosa.model.Nebulosa;

@RequestMapping("/v1/api/nebulosa/")
@RestController
public class ControllerNebulosa {
    
	private ServiceNebulosa serviceNebulosa;
	
	public ControllerNebulosa(ServiceNebulosa serviceNebulosa) {
	    this.serviceNebulosa = serviceNebulosa;
	}
	
	@PostMapping
	public Nebulosa save(@RequestBody Nebulosa nebulosa) {
		return serviceNebulosa.salvar(nebulosa);
	}
}
