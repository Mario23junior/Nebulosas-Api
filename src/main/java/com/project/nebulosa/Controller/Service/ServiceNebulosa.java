package com.project.nebulosa.Controller.Service;

import org.springframework.stereotype.Service;

import com.project.nebulosa.Repositorys.RepositoryNebulosa;
import com.project.nebulosa.model.Nebulosa;

@Service
public class ServiceNebulosa {
    
	private RepositoryNebulosa repositoryNebulosa;
	
	public ServiceNebulosa(RepositoryNebulosa repositoryNebulosa) {
		 this.repositoryNebulosa = repositoryNebulosa;
	}
	
	public Nebulosa salvar(Nebulosa nebulosa){
		Nebulosa saveNebulosa = repositoryNebulosa.save(nebulosa);
		return saveNebulosa;
	}
}
