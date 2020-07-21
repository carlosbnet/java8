package br.com.startsl.springmvc.controller;

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

	@RequestMapping("/message")
	public String message() {
		return "hello"; // nesse caso qual pagina deve voltar essa informação
	}

	// Formas de passar paramentros para as views

	@RequestMapping("/massageserver")
	public String messageServer(Model model) {

		model.addAttribute("message", new Date().toString()); // Nesta forma recebemos um objeto Model e setamos os
																// atributos
																// e na jsp basta usar os atributos
																// Vantagem: POSSO PASSAR QUANTOS ATRIBUTOS QUISER
		return "messageserver";

	}

	@RequestMapping("/messageserver2")
	public ModelAndView messageServer2() { //

//		diferente do anterior este aqui passa so um objeto pode vez, nesse caso eu crio uma instancia do ModelAndView e passo os seguintes argumentos:
//		Nome da pagina JSP, Atributo, valor do atributo

		return new ModelAndView("messageserver", "message", "Ola voce esta vendo outro jeito de passar");

	}

	// Metodo para receber algum valor, argumento etc do browser
	@RequestMapping("/recebermsg/{message}")
	public String receberMessagem(Model model, @PathVariable("message") String message) {

		model.addAttribute("message", message);

		return "messageserver";

	}

	@RequestMapping("/recebermsg2")
	public String recebermsg2(Model model, @RequestParam(value = "message") String message) {

		model.addAttribute("message", message);

		return "messageserver";
	}

}