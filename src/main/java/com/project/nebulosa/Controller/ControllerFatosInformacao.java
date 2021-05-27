package com.project.nebulosa.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.nebulosa.Controller.Service.ServiceFatosInformacao;
import com.project.nebulosa.model.FatosInformacao;

@RestController
@RequestMapping("/v1/api/fatosInformacao/")
public class ControllerFatosInformacao {
    
	private ServiceFatosInformacao serviceFatosInformacao;
	
	public ControllerFatosInformacao(ServiceFatosInformacao serviceFatosInformacao) {
		this.serviceFatosInformacao = serviceFatosInformacao;
 	}
	
	@PostMapping
	public FatosInformacao save(@RequestBody FatosInformacao fatosInformacao) {
		return serviceFatosInformacao.salveFatosInformation(fatosInformacao);
	}
}
