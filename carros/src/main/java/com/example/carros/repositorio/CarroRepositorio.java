package com.example.carros.repositorio;


import com.example.carros.domain.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CarroRepositorio extends JpaRepository<Carro, Long> {

    List<Carro> findByTipo(String tipo);


}
