package br.com.prmarinho.correios.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.prmarinho.correios.enums.CategoriaPacote;
import br.com.prmarinho.correios.enums.StatusPacote;
import br.com.prmarinho.correios.model.Pacote;
import br.com.prmarinho.correios.service.PacoteService;

@Controller
@RequestMapping(value="/pacotes")
public class PacoteController {

private static final String VIEW_CADASTRO = "cadastro";
	
	@Autowired private PacoteService service;
	
	@RequestMapping(value="/novo", method=RequestMethod.GET)
	public ModelAndView novo() {

		ModelAndView mv =new ModelAndView(VIEW_CADASTRO);
		mv.addObject("pacote", new Pacote()); 		
		return mv;
	}
	
	@ModelAttribute("statusPacote")
	public List<StatusPacote> getStatusPacote(){
		return Arrays.asList(StatusPacote.values());
	}
	
	@ModelAttribute("categoriaPacote")
	public List<CategoriaPacote> getCategoriaPacote(){
		return Arrays.asList(CategoriaPacote.values());
	}
}
