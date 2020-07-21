package br.com.startsl.springmvc.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import br.com.startsl.springmvc.dominios.Album;


@Repository
public interface repositorioAlbumCustom extends JpaRepository<Album, Long>{

   @Query("SELECT a FROM Album a WHERE  a.nome LIKE %:nome%")
   List<Album> findByNome(@Param("nome") String nome);

void deleteById(Long id);

}
