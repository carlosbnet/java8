package br.com.startsl.apppet.repositorios;

import br.com.startsl.apppet.dominios.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public interface RepositorioUsuario  extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}
