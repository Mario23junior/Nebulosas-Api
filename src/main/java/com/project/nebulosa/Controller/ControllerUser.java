package com.project.nebulosa.Controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.nebulosa.Controller.Service.ServiceUser;
import com.project.nebulosa.model.User;

@RestController
@RequestMapping("/user")
public class ControllerUser {

 	private BCryptPasswordEncoder bCryptPasswordEncoder;
	private ServiceUser serviceUser;

	public ControllerUser(BCryptPasswordEncoder bCryptPasswordEncoder ,ServiceUser serviceUser) {
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
		this.serviceUser = serviceUser;
 	}

	@PostMapping("/record")
	public void singUp(@RequestBody User user) {
       user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
       serviceUser.saveUser(user);
	}
}
