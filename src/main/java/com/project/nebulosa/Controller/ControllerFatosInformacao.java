package com.project.nebulosa.Controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/{id}")
	public Optional<FatosInformacao> listId(@PathVariable Long id) {
		return serviceFatosInformacao.listfatosInformacao(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		 serviceFatosInformacao.deleteFatosInformatin(id);
	}
	
	@PutMapping("/{id}")
	public void update(@RequestBody FatosInformacao fatosInformacao, @PathVariable Long id) {
		 serviceFatosInformacao.updateData(fatosInformacao, id);
	}
	
	
}












