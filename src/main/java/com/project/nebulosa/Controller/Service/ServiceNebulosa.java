package com.project.nebulosa.Controller.Service;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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
	
	public Optional<Nebulosa> buscaId(Long id) {
		Optional<Nebulosa> buscaId = repositoryNebulosa.findById(id);
		return Optional.of(buscaId
				  .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Nenhuma nebulosa encontrada")));
	}
}	