package com.project.nebulosa.Repositorys;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.nebulosa.model.Usuario;

public interface RepositoryUsuario extends JpaRepository<Usuario, Long> {
  
	Optional<Usuario> findByLogin(String login);
}
