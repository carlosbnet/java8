package br.com.startsl.apppet.controllers;


import br.com.startsl.apppet.dominios.Animal;
import br.com.startsl.apppet.repositorios.RepositorioAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/animal")
public class AnimalController {

    //Com essa anotação dizemos para o spring gerenciar pra nos
    @Autowired
    private RepositorioAnimal repositorio;

    @RequestMapping(value = "/listar")
    public String listar(Model model){

       List<Animal> animais =  repositorio.findAll();

        model.addAttribute("animais", animais);

        return "animal.listar.tiles";
    }

    //Action para adicionar

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String adicionar(Model model){

        model.addAttribute("animal", new Animal()); //adicionar um novo modelo de animal ja instanciado, para ser usado pela pagina

        return "animal.adicionar.tiles";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String adicionar(@ModelAttribute("animal") @Valid Animal novoAnimal, BindingResult result, Model model){

            repositorio.save(novoAnimal);

        return "redirect:/animal/listar";

    }


    @RequestMapping(value = "/alterar/{id}" , method = RequestMethod.GET)
    public String alterar(@PathVariable("id") Long id,Model model){

       Animal animal = repositorio.findOne(id);

       model.addAttribute("animal",animal);

        return "animal.alterar.tiles";
    }


    @RequestMapping(value = "/alterar" ,method = RequestMethod.POST)
    public String alterar(@ModelAttribute("animal") Animal alterarAnimal){

        repositorio.save(alterarAnimal);

        return "redirect:/animal/listar";
    }


    @RequestMapping(value = "/excluir/{id}", method = RequestMethod.GET)
    public String excluir(@PathVariable("id") Long id){

            repositorio.delete(id);

            return "redirect:/animal/listar";
    }



}
