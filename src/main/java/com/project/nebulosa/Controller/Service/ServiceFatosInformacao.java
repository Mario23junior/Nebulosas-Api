package com.project.nebulosa.Controller.Service;

import org.springframework.stereotype.Service;

import com.project.nebulosa.Repositorys.RepositoryFatosInformation;
import com.project.nebulosa.model.FatosInformacao;

@Service
public class ServiceFatosInformacao {
   
	private RepositoryFatosInformation repositoryFatosInformation;
	
	public ServiceFatosInformacao(RepositoryFatosInformation repositoryFatosInformation) {
		this.repositoryFatosInformation = repositoryFatosInformation;
 	}
	
	public FatosInformacao salveFatosInformation(FatosInformacao fatosInformacao) {
		 FatosInformacao salvardados = repositoryFatosInformation.save(fatosInformacao);
		 return salvardados;
	}
}
