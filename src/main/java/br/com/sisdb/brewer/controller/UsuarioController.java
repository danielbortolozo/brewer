package br.com.sisdb.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.sisdb.brewer.model.Usuario;

@Controller
public class UsuarioController {

	
	
	@RequestMapping("/usuario/novo")
	public String novo(Usuario usuario) {		
		return "usuario/cadastroUsuario";
	}
	
    @RequestMapping(value = "/usuario/novo", method = RequestMethod.POST)
    public String cadastrar(@Valid Usuario usuario, BindingResult result, Model model, 
    	                	RedirectAttributes attributes) {
    	
    	if (result.hasErrors()) {			
			return novo(usuario);
		}
    	
    	
    	return "redirect:/usuario/novo";
    }
	
	
	
	
	
	
}
