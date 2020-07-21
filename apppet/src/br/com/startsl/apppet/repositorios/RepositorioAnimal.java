package br.com.startsl.apppet.repositorios;

import br.com.startsl.apppet.dominios.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioAnimal extends JpaRepository<Animal, Long> {

    Animal findByNome(String nome);


}
