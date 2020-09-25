package com.example.carros.service;


import com.example.carros.api.controller.exception.ObjectNotFoundException;
import com.example.carros.domain.Carro;
import com.example.carros.domain.dto.CarroDTO;
import com.example.carros.repositorio.CarroRepositorio;
import org.hibernate.boot.archive.scan.spi.ScanOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private CarroRepositorio repositorio;

    public List<CarroDTO> getCarros() {

        List<Carro> carros = repositorio.findAll();

        List<CarroDTO> listDTO = new ArrayList<>();

        for (Carro c: carros  ) {
            listDTO.add(CarroDTO.create(c));
        }

        return listDTO;
    }




    public CarroDTO getCarroById(Long id){

        Optional<Carro> carro = repositorio.findById(id);

        return carro.map(CarroDTO::create).orElseThrow(()-> new ObjectNotFoundException("Carro não encontrado"));

    }




    public List<CarroDTO> getCarrobyTipo(String tipo) {

            List<Carro> carros = repositorio.findByTipo(tipo);

            List<CarroDTO> listDTO  = new ArrayList<>();

        for (Carro c: carros ) {
            listDTO.add(CarroDTO.create(c));
        }

        return listDTO;


    }

    public CarroDTO insert(Carro carro){

        Assert.isNull(carro.getId(), "Nao foi possivel inserir o registro");

       return CarroDTO.create(repositorio.save(carro));
    }


    public CarroDTO update(Carro carro, Long id) {

        Assert.notNull(id,"Nao foi possivel encontrar o ID");

        Optional<Carro> optional = repositorio.findById(id);
        if (optional.isPresent()){
            Carro db = optional.get();

            db.setNome(carro.getNome());
            db.setTipo(carro.getTipo());

            System.out.println("Carro id "+ db.getId());

            repositorio.save(db);
            return CarroDTO.create(db);
        }else{
           return null;
        }



    }

    public void  del(Long id) {
            repositorio.deleteById(id);

    }
}
