package br.com.startsl.apppet.controllers;


import br.com.startsl.apppet.dominios.Usuario;
import br.com.startsl.apppet.repositorios.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {


    @Autowired
    private RepositorioUsuario repositorio;


    @RequestMapping(value = "/listar" ,method = RequestMethod.GET)
    public String listar(Model model) {

        List<Usuario> usuarios = repositorio.findAll();


        model.addAttribute("usuarios", usuarios);

        return "usuario.listar.tiles";
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String adicionar(Model model) {

        model.addAttribute("usuario", new Usuario());

        return "usuario.adicionar.tiles";

    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String adicionar(@ModelAttribute("usuario") Usuario usuario) {


        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        usuario.setPassword(encoder.encode(usuario.getPassword()));

        repositorio.save(usuario);

        return "redirect:/usuario/listar";
    }


    @RequestMapping(value = "/alterar", method = RequestMethod.GET)
    public String alterar(@RequestParam(name = "id") Long id, Model model) {

        Usuario usuario = repositorio.findOne(id);

        model.addAttribute("usuario", usuario);

        return "usuario.alterar.tiles";

    }


    @RequestMapping(value = "/alterar", method = RequestMethod.POST)
    public String alterar(@ModelAttribute("usuario") Usuario usuario) {

        repositorio.save(usuario);

        return "redirect:/usuario/listar";
    }


    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(@RequestParam(name = "id") Long id) {

        repositorio.delete(id);

        return "redirect:/usuario/listar";
    }




}