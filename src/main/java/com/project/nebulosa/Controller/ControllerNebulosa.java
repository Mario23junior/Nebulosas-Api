package com.project.nebulosa.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/{id}")
	public Optional<Nebulosa> listId(@PathVariable Long id) {
		return serviceNebulosa.buscaId(id);
	}
	
	@GetMapping("/find")
	public List<Nebulosa> listByCostelcaos(@RequestParam(name = "costelacao")String costelacao){
		return serviceNebulosa.buscarPorCostelacao(costelacao);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		 serviceNebulosa.deleteData(id);
	}
}
