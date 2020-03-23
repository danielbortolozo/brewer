package br.com.sisdb.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.sisdb.brewer.model.Cliente;

@Controller
public class ClienteController {
	
	@RequestMapping("/cliente/novo")
	public String novo(Cliente cliente) {		
		return "cliente/cadastroCliente";
	}
	

	@RequestMapping(value = "/cliente/novo", method = RequestMethod.POST)
    public String cadastrar(@Valid Cliente cliente, BindingResult result, Model model,
    		RedirectAttributes attributes) {
		if (result.hasErrors()) {			
			return novo(cliente);
		}
		//salvar ..	
		
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");
		System.out.println("Cerveja cadastrada com sucesso GET-Object: "+ 
		cliente.getNome());
		return "redirect:/cliente/novo";
	}
	
	
}
