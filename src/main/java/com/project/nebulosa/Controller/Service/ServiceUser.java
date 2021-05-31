package com.project.nebulosa.Controller.Service;

import org.springframework.stereotype.Service;

import com.project.nebulosa.Repositorys.RepositoryUser;
import com.project.nebulosa.model.User;

@Service
public class ServiceUser {

	RepositoryUser repositoryUser;
	
	public ServiceUser(RepositoryUser repositoryUser) {
		this.repositoryUser = repositoryUser;
	}
	
	public void saveUser(User user) {
		repositoryUser.save(user);
	}
}
