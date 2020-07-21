package br.com.startsl.apppet.controllers;


import br.com.startsl.apppet.dominios.MedicoVeterinario;
import br.com.startsl.apppet.repositorios.RepositorioMedicoVeterinario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

@Controller
@RequestMapping("/medico")
public class MedicoVetController {

    @Autowired
    private RepositorioMedicoVeterinario repositorio;

    @RequestMapping(value = "/listar" , method = RequestMethod.GET)
    public String listar(Model model){

        List<MedicoVeterinario> medicoVeterinarios = repositorio.findAll();

        model.addAttribute("medicos", medicoVeterinarios);

        return "medico.listar.tiles";
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String adicionar(Model model){

        model.addAttribute("medico",new MedicoVeterinario());

        return "medico.adicionar.tiles";

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String adicionar(@ModelAttribute("medico") MedicoVeterinario medicoVeterinario){

        repositorio.save(medicoVeterinario);

        return "redirect:/medico/listar";
    }

    @RequestMapping(value = "/alterar/{id}" ,method = RequestMethod.GET)
    public String alterar(@PathVariable("id") Long id,Model model){

        MedicoVeterinario medicoVeterinario = repositorio.findOne(id);

        model.addAttribute("medico", medicoVeterinario);

        return "medico.alterar.tiles";
    }


    @RequestMapping(value = "/alterar", method = RequestMethod.POST)
    public String alterar(@ModelAttribute("medico") MedicoVeterinario alterarMedico){

            repositorio.save(alterarMedico);

        return "redirect:/medico/listar";
    }



    @RequestMapping(value = "/excluir/{id}", method = RequestMethod.GET)
    public String deletar(@PathVariable("id") Long id){

        repositorio.delete(id);

        return "redirect:/medico/listar";
    }



}
