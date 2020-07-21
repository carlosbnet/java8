package br.com.start.curso.service;

import br.com.start.curso.domain.Curso;

import java.util.Date;
import java.util.List;

public interface CursoSerivce {

    void save(Curso curso);

    void update(Long id,Curso curso);

    void delete(Long id);

    Curso findById(Long id);

    List<Curso> findAll();

    Curso updateDataIncio(Long id, Date dataInicio);

}
