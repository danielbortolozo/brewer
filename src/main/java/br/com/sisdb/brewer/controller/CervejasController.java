package br.com.sisdb.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.sisdb.brewer.model.Cerveja;

@Controller
public class CervejasController {
	
	@RequestMapping("/cervejas/novo")
	public String novo(Cerveja cerveja) {		
		return "cerveja/cadastroCerveja";
	}
	
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
    public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model,
    		RedirectAttributes attributes) {
		if (result.hasErrors()) {			
			return novo(cerveja);
		}
		//salvar ..	
		
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");
		System.out.println("Cerveja cadastrada com sucesso GET-Object: "+ 
		cerveja.getSku()+" "+cerveja.getNome()+ " "+cerveja.getDescricao());
		return "redirect:/cervejas/novo";
	}
	
		
	
}
