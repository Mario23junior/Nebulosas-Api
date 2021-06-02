package com.project.nebulosa.Service.ServiceBase;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project.nebulosa.Exception.ResourceNotFoundException;
import com.project.nebulosa.Repositorys.RepositoryUsuario;
import com.project.nebulosa.model.Usuario;

@Service
public class SecurityService implements UserDetailsService {

	@Autowired
	private RepositoryUsuario repositoryUsuario;
    
	@Transactional
	public Usuario salvar(Usuario usuario) {
		return repositoryUsuario.save(usuario);
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
    Usuario user = repositoryUsuario
		           .findByLogin(username)
		           .orElseThrow(() -> new ResourceNotFoundException("Esse usuario não possui cadastro"));
    
    String[] roles = user.isAdmin() ? new String[] 
    		{"ADMIN","USER"} : new String[] {"USER"};
    
      return User
    		   .builder()
    		   .username(user.getLogin())
    		   .password(user.getSenha())
    		   .roles(roles)
    		   .build();
	}

}
