package com.project.nebulosa.Controller.Service;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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
	
	public Optional<FatosInformacao> listfatosInformacao(Long id){
		Optional<FatosInformacao> listId = repositoryFatosInformation.findById(id);
		Optional.of(listId
				     .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Nenhuma informacao foi encontrada")));
		return listId;
	}
	
	public void deleteFatosInformatin(Long id){
 		   repositoryFatosInformation
 				               .findById(id)
 				               .map(deleteData -> {
 				            	   repositoryFatosInformation.deleteById(id);
 				            	   return deleteData;
 				               }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Nenhuma informação doi deletada"));
 				            
	}
}
