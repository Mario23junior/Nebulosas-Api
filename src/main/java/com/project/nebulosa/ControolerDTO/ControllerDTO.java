package com.project.nebulosa.ControolerDTO;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.nebulosa.Service.ServiceImplement;

import ModelDTO.NebulosaDTO;

@RestController
@RequestMapping("/v1/api/listall/")
public class ControllerDTO {
    
	private ServiceImplement serviceImplement;
	
	public ControllerDTO(ServiceImplement serviceImplement) {
		this.serviceImplement = serviceImplement;
 	}
	
	@GetMapping
	public List<NebulosaDTO> list() {
		return serviceImplement.listAllDto();
	}
}
