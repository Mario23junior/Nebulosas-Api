package com.project.nebulosa.Service.ServiceBase;

 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.nebulosa.Exception.ResourceNotFoundException;

@Service
public class SecurityService implements UserDetailsService{
	
    @Autowired
 	private PasswordEncoder encoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		if(!username.equals("poteDeMel")) {
			throw new ResourceNotFoundException("Usuario não encontrado no baco de dados");
		}
		
 		return User
 				  .builder()
 				  .username("poteDeMel")
 				  .password(encoder.encode("432"))
 				  .roles("USER","ADMIN")
 				  .build();
	}

}
