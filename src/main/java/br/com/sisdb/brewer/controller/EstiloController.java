package br.com.sisdb.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EstiloController {

	
	@RequestMapping("/estilo/novo")
	public String novo() {
		System.out.println("passei aqui no controller >>>>>");
		return "estilo/cadastroEstilo";
	}
	
}
