package br.com.startsl.springmvc.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.hibernate.validator.internal.util.privilegedactions.NewInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import antlr.collections.List;
import br.com.startsl.springmvc.dominios.Album;
import br.com.startsl.springmvc.dominios.Musica;
import br.com.startsl.springmvc.repositorios.RepositorioMusicas;
import br.com.startsl.springmvc.repositorios.repositorioAlbumCustom;

@Controller
@RequestMapping("/musicas")
public class MusicaController {

	@Autowired
	private repositorioAlbumCustom repositorioAlbumCustom;
	@Autowired
	private RepositorioMusicas repositorioMusicas;
	
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(Model model) {
		List musicasList =  (List) repositorioMusicas.findAll();
		
		model.addAttribute("musicas", musicasList);
		
		return "musica.listar.tiles";
	}
	
	
	@RequestMapping(value = "/adicionar", method = RequestMethod.GET)
	public String adicionar(Model model) {
		
		model.addAttribute("musica", new Musica());
		model.addAttribute("albuns", repositorioAlbumCustom.findAll());
		
		return "musica.adicionar.tiles";
	}
	
	@RequestMapping(value = "/adicionar", method = RequestMethod.POST)
	public String adicionar(@ModelAttribute("musica") @Valid Musica musica,BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			model.addAttribute("albuns", repositorioAlbumCustom.findAll());
			return "musica.adicionar.tiles";
		}
		
		repositorioMusicas.save(musica);
			
		return "musica.listar.tiles";
	}
	
	@RequestMapping(value = "/alterar/{id}", method = RequestMethod.GET)
	public String alterar(@PathVariable("id") Long id, Model model) {
		
		Musica musicaalter = repositorioMusicas.getOne(id);
		
		model.addAttribute("musica", musicaalter );
		model.addAttribute("albuns", repositorioAlbumCustom.findAll());
		
		
		return "musica.alterar.tiles";
	}
	
	
	@RequestMapping(value = "/alterar", method = RequestMethod.POST)
	public String alterar(@ModelAttribute("musica") @Valid Musica musica, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			model.addAttribute("albuns", repositorioAlbumCustom.findAll());
			return "musica.alterar.tiles";
		}
		
		repositorioMusicas.save(musica);
		
		return "mmusica.listar.tiles";
	}
	
	
	@RequestMapping(value = "/excluir/{id}",method = RequestMethod.GET)
	public String exluir(Model model, @PathVariable("id") Long id) {
		
		Musica musicaalter = repositorioMusicas.getOne(id);
		
		musicaalter.setAlbum(null);
		
		repositorioMusicas.deleteById(id);
		
		return "musicas.listar.tiles";
		
	}
	
	
}
