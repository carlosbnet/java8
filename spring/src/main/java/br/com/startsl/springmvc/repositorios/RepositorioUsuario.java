package br.com.startsl.springmvc.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.startsl.springmvc.dominios.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long>{

	
	Usuario findByUserName (String username);
	
}
