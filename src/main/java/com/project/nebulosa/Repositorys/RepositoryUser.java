package com.project.nebulosa.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.nebulosa.model.User;

public interface RepositoryUser extends JpaRepository<User, Long>{
	
	User findByUsername(String username);

}
