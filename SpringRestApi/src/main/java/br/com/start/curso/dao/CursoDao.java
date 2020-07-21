package br.com.start.curso.dao;

import br.com.start.curso.domain.Curso;

import java.util.List;

//Cria uma inteface para nosso projeto
public interface CursoDao {

    void save (Curso curso);
    void update(Curso curso);
    void delete(Long id);
    Curso findById(Long id);
    List<Curso> findAll();
}
