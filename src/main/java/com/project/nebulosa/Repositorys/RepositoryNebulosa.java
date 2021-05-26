package com.project.nebulosa.Repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.nebulosa.model.Nebulosa;

public interface RepositoryNebulosa extends JpaRepository<Nebulosa, Long>{
    
	public List<Nebulosa> findByCostelacaoIgnoreCaseContaining(String costelacao);
}
