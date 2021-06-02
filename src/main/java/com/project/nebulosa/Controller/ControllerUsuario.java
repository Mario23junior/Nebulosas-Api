package com.project.nebulosa.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.nebulosa.Controller.Service.ServiceUsuario;
import com.project.nebulosa.model.Usuario;

@RestController
@RequestMapping("/v1/api/usuario")
public class ControllerUsuario {
   
	ServiceUsuario serviceUsuario;
	
	public ControllerUsuario(ServiceUsuario serviceUsuario) {
		this.serviceUsuario = serviceUsuario;
 	}
	
	@PostMapping
	public Usuario salvar(@RequestBody Usuario usuario) {
		return serviceUsuario.Salvar(usuario);
	}
}
