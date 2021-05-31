package com.project.nebulosa.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/secure")
public class SecuredController {
   
	@GetMapping
	public ResponseEntity<String> reachSecureEndpoint() {
		return new ResponseEntity<String>("se voce esta aqui então voce chegou a uma camada segura",HttpStatus.OK);
	}
}
