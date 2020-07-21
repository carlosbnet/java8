package br.com.startsl.springmvc.repositorios;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.startsl.springmvc.dominios.Musica;

public interface RepositorioMusicas extends JpaRepository<Musica, Long> {

	void deleteById(Long id);

}
