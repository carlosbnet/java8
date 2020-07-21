package br.com.treinaweb.springmvc.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {

	// <servidor>/app/hello/message

	@RequestMapping("/message")
	public String message() {
		return "hello";
	}

	@RequestMapping("/mensagemDoServidor")
	public String mensagemDoServidor(Model model) {
		model.addAttribute("mensagem", new Date().toString());
		return "mensagemDoServidor";
	}

	@RequestMapping("/mensagemDoServidor2")
	public ModelAndView mensagemDoServidorV2() {
		ModelAndView resultado = new ModelAndView("mensagemDoServidor", "mensagem", new Date().toString());
		return resultado;
	}

	@RequestMapping("/receberMensagem/{mensagem}")
	public String receberMensagem(Model model, @PathVariable("mensagem") String msg) {
		model.addAttribute("mensagem", msg);
		return "mensagemDoServidor";
	}
	
	@RequestMapping("/receberMensagem2")
	public String receberMensagem2(Model model, @RequestParam(value = "mensagem", required = false, defaultValue = "Mensagem padrao") String msg){
		model.addAttribute("mensagem", msg);
		return "mensagemDoServidor";
	}
}
