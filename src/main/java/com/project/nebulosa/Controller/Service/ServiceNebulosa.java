package com.project.nebulosa.Controller.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.nebulosa.Exception.ResourceNotFoundException;
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
				  .orElseThrow(() -> new ResourceNotFoundException("Nenhuma nebulosa encontrada")));
	}
	
	public List<Nebulosa> buscarPorCostelacao(String costelacao){
	   return repositoryNebulosa.findByCostelacaoIgnoreCaseContaining(costelacao);
	}
	
	public void deleteData(Long id) {
		repositoryNebulosa
		          .findById(id)
		          .map(deleteOrId -> {
		        	  repositoryNebulosa.deleteById(id);
		        	  return deleteOrId;
		          }).orElseThrow(() -> new ResourceNotFoundException("Nenhuma nebulosa encontrada para ser deletada"));
	}
	
	public void updateData(Nebulosa nebulosa, Long id) {
		repositoryNebulosa
		               .findById(id)
		               .map(updateDate -> {
		            	  nebulosa.setId(updateDate.getId());
		            	  repositoryNebulosa.save(nebulosa);
		            	  return updateDate;
		               }).orElseThrow(() -> new ResourceNotFoundException("Nenhuma nebulosa foi encontrada para atulizar"));
	}	
}
