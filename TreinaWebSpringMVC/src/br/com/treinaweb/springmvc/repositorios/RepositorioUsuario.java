package br.com.treinaweb.springmvc.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.springmvc.dominios.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);

}
