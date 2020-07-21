package br.com.startsl.apppet.repositorios;

import br.com.startsl.apppet.dominios.MedicoVeterinario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioMedicoVeterinario extends JpaRepository<MedicoVeterinario, Long> {

    MedicoVeterinario findByNome(String nome);

}
