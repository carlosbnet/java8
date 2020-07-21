package br.com.startsl.springmvc.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.catalina.connector.Response;
import org.hibernate.validator.internal.util.privilegedactions.NewInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.startsl.springmvc.dominios.Usuario;
import br.com.startsl.springmvc.repositorios.RepositorioUsuario;
import br.com.startsl.springmvc.repositorios.repositorioAlbumCustom;



@Controller
@RequestMapping("/usuarios")
public class UsuariosController {
	
	
	@Autowired
	private RepositorioUsuario repostorio;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(Model model) {
		
		List<Usuario> usuarios = repostorio.findAll();
		
		model.addAttribute("usuarios", usuarios);
		
		return "usuario.listar.tiles";
	}

	
	@RequestMapping(value = "/adicionar", method = RequestMethod.GET)
	public String adicionar(Model model) {
				
		model.addAttribute("usuario", new Usuario());
		
		return "usuario.adicionar.tiles";
	}
	
	
	@RequestMapping(value = "/adicionar", method = RequestMethod.POST)
	public String adicionar(@ModelAttribute("usuario") @Valid Usuario usuario, BindingResult result, Model model) {
				
		if (result.hasErrors()) {
			return "usuario.adicionar.tiles";
		}
		
		BCryptPasswordEncoder enconder = new BCryptPasswordEncoder();
		
		usuario.setPassword(enconder.encode(usuario.getPassword()));
		
		repostorio.save(usuario);
		
		return "usuario.listar.tiles";
	}
	
	
	
}
