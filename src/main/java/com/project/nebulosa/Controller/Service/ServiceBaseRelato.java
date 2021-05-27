package com.project.nebulosa.Controller.Service;

import org.springframework.stereotype.Service;

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
}
