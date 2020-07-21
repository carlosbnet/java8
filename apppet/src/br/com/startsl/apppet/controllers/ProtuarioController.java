package br.com.startsl.apppet.controllers;


import br.com.startsl.apppet.dominios.Prontuario;
import br.com.startsl.apppet.repositorios.RepositorioAnimal;
import br.com.startsl.apppet.repositorios.RepositorioMedicoVeterinario;
import br.com.startsl.apppet.repositorios.RepositoriosProtuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/prontuario")
public class ProtuarioController {


    @Autowired
    RepositoriosProtuarios repositorio;

    @Autowired
    RepositorioMedicoVeterinario repositorioMedicoVeterinario;

    @Autowired
    RepositorioAnimal repositorioAnimal;


    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public String listar(Model model){

        List<Prontuario> prontuarios = repositorio.findAll();

        model.addAttribute("prontuarios", prontuarios);

        return "prontuarios.listar.tiles";
    }



    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String adicionar(Model model){


        model.addAttribute("prontuario", new Prontuario());
        model.addAttribute("animais",repositorioAnimal.findAll());
        model.addAttribute("veterinarios", repositorioMedicoVeterinario.findAll());

        return "prontuario.adicionar.tiles";
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String adicionar(@ModelAttribute("prontuario") @Valid Prontuario novoProntuario){


        repositorio.save(novoProntuario);


        return "redirect:/prontuario/listar";

    }


    @RequestMapping(value = "/alterar/{id}", method = RequestMethod.GET)
    public String alterar(@PathVariable("id") Long id, Model model){

        Prontuario prontuario = repositorio.findOne(id);


        model.addAttribute("prontuario",prontuario);


        return "prontuario.alterar.tiles";

    }

    @RequestMapping(value = "/alterar", method = RequestMethod.POST)
    public String alterar(@ModelAttribute("prontuario") Prontuario prontuario){

        repositorio.save(prontuario);

        return "redirect:/prontuario/listar";

    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(@RequestParam(name = "id") Long id){

        repositorio.delete(id);

        return "redirect:/prontuario/listar";

    }


}
