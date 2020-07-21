package br.com.startsl.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import br.com.startsl.springmvc.dominios.Album;
import br.com.startsl.springmvc.repositorios.repositorioAlbumCustom;
import java.util.List;

@Controller
@RequestMapping("/albuns")
public class AlbunsController {

	@Autowired
	private repositorioAlbumCustom repositorio;
	
	
	// requisição feita em get prepara o Objeto e joga para a pagina adicionar
	@RequestMapping(value = "/adicionar", method = RequestMethod.GET)
	public String adicionar(Model model) {

		model.addAttribute("album", new Album());
		
		return "album.adicionar.tiles";

	}

	// depois a pagina adiconar mandar o objeto Album preenchido e so pegamos os
	// valores no objeto Album
	// para likar os objetos bastar usar a Anotação ModelAtribute, tanto no medoto
	@RequestMapping(value = "/adicionar", method = RequestMethod.POST)
	public String adicionar(@ModelAttribute("album") @Valid Album album, BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "album.adicionar.tiles";
		}

		repositorio.save(album);

		return "album.exibir.tiles";

	}
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(Model model) {
		List<Album> albunsList = repositorio.findAll();
		
		model.addAttribute("albuns", albunsList);
				
		return "album.listar.tiles";
		
	}
	
	@RequestMapping(value = "/alterar/{id}",method = RequestMethod.GET)
	public String alterar(Model model, @PathVariable("id") Long id) {
		
		Album albumalter = repositorio.getOne(id);
		
		model.addAttribute("album", albumalter);
		
		return "album.alterar.tiles";
		
	}
	
	@RequestMapping(value = "/alterar",method = RequestMethod.POST)
	public String alterar(Model model, @ModelAttribute("album") @Valid Album album, BindingResult result) {
		
		if (result.hasErrors()) {
			return "album.alterar.tiles";
		}
		
		repositorio.save(album);
		
		return "redirect:/albuns/listar";
	}
	
	@RequestMapping(value = "/excluir/{id}",method = RequestMethod.GET)
	public String exluir(Model model, @PathVariable("id") Long id) {
		
		repositorio.deleteById(id);
		
		return "album.alterar.tiles";
		
	}
	
	//metodo que pesquisa pelo nome, feito totalmente de forma simples e personalizada
	//basta acrescentar na inteface por qual atributo vai querer fazer a pesquisa
	@RequestMapping(value = "/pornome", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Album> pesquisarNome(@RequestParam(name = "nome", defaultValue = "") String nomeAlbum){

		return repositorio.findByNome(nomeAlbum);

	}

}