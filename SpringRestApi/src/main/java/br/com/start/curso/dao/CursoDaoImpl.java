package br.com.start.curso.dao;

import br.com.start.curso.domain.Curso;
import br.com.start.curso.exception.NaoExisteDaoException;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CursoDaoImpl implements CursoDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Curso curso) {

        entityManager.persist(curso);
    }

    @Override
    public void update(Curso curso) {

        entityManager.merge(curso);
    }

    @Override
    public void delete(Long id) {

        try {
            entityManager.remove(entityManager.getReference(Curso.class, id));
        }catch (EntityNotFoundException e){
            throw new NaoExisteDaoException("Curso nao encontrado para id = "+id+".");
        }


    }

    @Override
    public Curso findById(Long id) {
        Curso curso = entityManager.find(Curso.class, id);
        //Como o find nao lanca nehuma exceção quando nao encontra nada temos que foçar ele a fazer o mesmo
            if (curso == null){
                throw new NaoExisteDaoException("Curso nao encontrado para id = "+id+".");
            }

        return curso;
    }

    @Override
    public List<Curso> findAll() {
        return entityManager
                .createQuery("select c from Curso c", Curso.class)
                .getResultList();
    }
}