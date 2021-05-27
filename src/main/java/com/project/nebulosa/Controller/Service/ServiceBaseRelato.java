package com.project.nebulosa.Controller.Service;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.project.nebulosa.Repositorys.RepositoryBaseRelato;
import com.project.nebulosa.model.BaseRelato;

@Service
public class ServiceBaseRelato {
   
	private RepositoryBaseRelato repositoryBaseRelato;
	
	public ServiceBaseRelato(RepositoryBaseRelato repositoryBaseRelato) {
		this.repositoryBaseRelato = repositoryBaseRelato;
 	}
	
	public BaseRelato salvarData(BaseRelato baseRelato) {
		BaseRelato salvarData = repositoryBaseRelato.save(baseRelato);
		return salvarData;
	}
	
	public Optional<BaseRelato> listId(Long id){
		Optional<BaseRelato> list = repositoryBaseRelato.findById(id);
		list.orElseThrow(() ->  new ResponseStatusException(HttpStatus.NO_CONTENT,"Nenhuma informacão foi em contrada"));
		return list;
	}
	
	public void delete(Long id) {
		repositoryBaseRelato
		            .findById(id)
		            .map(delete -> {
		            	repositoryBaseRelato.deleteById(id);
		            	return delete;
		            }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Nenhuma informação foi encontrada"));
	}
}
