package com.project.nebulosa.Controller.Service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.nebulosa.Service.ServiceBase.SecurityService;
import com.project.nebulosa.model.Usuario;

@Service
public class ServiceUsuario {
    
	private SecurityService usuarioService;
	private PasswordEncoder passwordEncoder;
	
	public ServiceUsuario(SecurityService usuarioService , PasswordEncoder passwordEncoder) {
		this.usuarioService = usuarioService;
		this.passwordEncoder = passwordEncoder;
 	}
	
	public Usuario Salvar(Usuario usuario) {
		String senhaCriptografada = passwordEncoder.encode(usuario.getSenha());
		usuario.setSenha(senhaCriptografada);
		return usuarioService.salvar(usuario);
	}
}
