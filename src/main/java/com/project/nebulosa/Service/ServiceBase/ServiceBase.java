package com.project.nebulosa.Service.ServiceBase;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.project.nebulosa.Repositorys.RepositoryNebulosa;
import com.project.nebulosa.Service.ServiceImplement;
import com.project.nebulosa.model.Nebulosa;

import ModelDTO.NebulosaDTO;

@Service
public class ServiceBase implements ServiceImplement{
      
	private RepositoryNebulosa repositoryNebulosa;
	private ModelMapper modelMapper;
	
	public ServiceBase(RepositoryNebulosa repositoryNebulosa, ModelMapper modelMapper) {
		this.repositoryNebulosa = repositoryNebulosa;
		this.modelMapper = modelMapper;
	}
	
 	public List<NebulosaDTO> list_nebulosa() {
 		return ((List<Nebulosa>) repositoryNebulosa
 				.findAll())
 				.stream()
 				.map(this::ConvertEntidadeToDto)
 				.collect(Collectors.toList());
	}
 	
 	public NebulosaDTO ConvertEntidadeToDto(Nebulosa nebulosa) {
  		modelMapper.getConfiguration()
  	               .setMatchingStrategy(MatchingStrategies.LOOSE);
  		
  		NebulosaDTO nebulosaDTO = modelMapper
  				.map(nebulosa, NebulosaDTO.class);
  		
  		return nebulosaDTO;
 	}
 	
 	public List<NebulosaDTO> listAllDto() {
 		List<NebulosaDTO> list = list_nebulosa();
 		return list 
 				 .stream()
 				 .collect(Collectors.toList());
 	}

 
}
