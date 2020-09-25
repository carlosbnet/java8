package com.example.carros.api.controller;


import com.example.carros.domain.Carro;
import com.example.carros.domain.dto.CarroDTO;
import com.example.carros.service.CarroService;
import org.hibernate.boot.archive.scan.spi.ScanOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import javax.servlet.Servlet;
import javax.swing.text.html.parser.Entity;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/carros")
public class CarrosController {

    @Autowired
    private CarroService service;



    @GetMapping()
    public ResponseEntity getCarros(){
        //return new ResponseEntity<>(service.getCarros(), HttpStatus.OK);
        return ResponseEntity.ok(service.getCarros());

    }
    
    @GetMapping("/{id}")
    public ResponseEntity getCarro(@PathVariable("id") Long id){

        CarroDTO carro = service.getCarroById(id);

        return ResponseEntity.ok(carro);
    }

    @GetMapping("/tipo/{tipo}")
    public ResponseEntity getCarroByTipo(@PathVariable("tipo") String tipo){

        List<CarroDTO> carros = service.getCarrobyTipo(tipo);

        return carros.isEmpty() ?
             ResponseEntity.noContent().build() :
             ResponseEntity.ok(carros);

    }



    @PostMapping()
    @Secured({
            "ROLE_ADMIN"
    })
    public ResponseEntity postCarro(@RequestBody Carro carro){

            CarroDTO c = service.insert(carro);

            URI location = getUri(c.getId());
            return ResponseEntity.created(location).build();

    }

    private URI getUri(Long id) {
         return ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                 .buildAndExpand(id).toUri();
    }


    @PutMapping("/{id}")
    public ResponseEntity putCarro(@PathVariable("id") Long id, @RequestBody Carro carro){


            CarroDTO c = service.update(carro,id);

            return c != null ? ResponseEntity.ok(c) :
                               ResponseEntity.notFound().build();

    }


    @DeleteMapping("/{id}")
    public void deleteCarro(@PathVariable("id") Long id) {


        service.del(id);

        ResponseEntity.notFound().build();


    }
    }