package br.com.start.curso.service;

import br.com.start.curso.dao.CursoDao;
import br.com.start.curso.domain.Curso;
import br.com.start.curso.exception.IdNaoValidoServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class CursoServiceImpl implements CursoSerivce{

    @Autowired
    private CursoDao dao;

    @Override
    public void save(Curso curso) {
        dao.save(curso);
    }

    @Override
    public void update(Long id, Curso curso) {
            curso.setId(idValido(id));
            dao.findById(id);
            dao.update(curso);
    }

    @Override
    public void delete(Long id) {
        dao.delete(idValido(id));
    }

    @Override
    @Transactional(readOnly = true)
    public Curso findById(Long id) {
        return dao.findById(idValido(id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Curso> findAll() {
        return dao.findAll();
    }


    @Override
    public Curso updateDataIncio(Long id, Date dataInicio) {

        Curso curso = dao.findById(idValido(id));
        curso.setDataInicio(dataInicio);

        return curso;
    }


    private Long  idValido(Long id){
    if (id<=0){
    throw new IdNaoValidoServiceException("Valor do campo id esta invalido");
    }
    return id;
    }

}
