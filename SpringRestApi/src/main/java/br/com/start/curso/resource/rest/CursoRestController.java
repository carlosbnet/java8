package br.com.start.curso.resource.rest;

//Anotação abaixo de para o java que a esse controller vai ser usado como rest
//e tambem vai receber solicitações


import br.com.start.curso.domain.Curso;
import br.com.start.curso.service.CursoSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Date;
import java.util.List;

//Produces é o que vem pra mim, no caso no formato de json
//Consumes é o que eu vou fornecer ou seja mandar como resposta

@RestController
@RequestMapping(value = "/cursos", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CursoRestController {

    @Autowired
    private CursoSerivce serivce;

    @PostMapping //mapea para resquests em posts
    public ResponseEntity<Void> salvar(@RequestBody Curso curso){

        //Salva no banco de dados
        serivce.save(curso);

        //Cria nossa URI com base na que foi recebida ou seja enviada pelo cliente
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(curso.getId())
                .toUri();

        System.out.println(location);

        return ResponseEntity.created(location).build(); //Ele da o estatus de ok ou 201 de retorno


    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Curso editar(@PathVariable("id")  Long id, @RequestBody Curso curso){

        serivce.update(id,curso);
        return curso;
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Curso editaDataInicio(@PathVariable("id") Long id, @RequestBody Curso curso){

            return serivce.updateDataIncio(id,curso.getDataInicio());
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable("id")Long id){
        serivce.delete(id);
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Curso getCurso(@PathVariable("id")Long id){
        return serivce.findById(id);
    }


    //GetMapping - diz que so acessa pelo vebo GET, como nao mapeamos fica o mapeamento da classe acima
    //Porem pode ser colocado um Mapping sem nenhum problema
    @GetMapping
    //Especifica o status de sucesso para o listar
    @ResponseStatus(HttpStatus.OK)
    public List<Curso> listarCursos(){
            return serivce.findAll();
    }

}
