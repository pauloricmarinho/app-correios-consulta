package br.com.prmarinho.correios.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.prmarinho.correios.enums.CategoriaPacote;
import br.com.prmarinho.correios.enums.StatusPacote;
import br.com.prmarinho.correios.model.Pacote;
import br.com.prmarinho.correios.repository.filter.PacoteFilter;
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
	
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView salvar(@Validated Pacote pacote, Errors errors, RedirectAttributes attributes) {
		
		if(errors.hasErrors()) {			
			return new ModelAndView(VIEW_CADASTRO);
		}
		
		try {
			service.salvar(pacote);						
			ModelAndView mvSave = new ModelAndView("redirect:/pacotes/novo");
			/*Enviando uma Mensagem ou Objeto em uma Requisição de Redirect*/
			attributes.addFlashAttribute("mensagem", "Pacote '".concat( pacote.getDescricao() ).concat("' Salvo com Sucesso!"));
			/*Redirecionar para Página de Cadastro e Limpa o Objeto Pacote*/
			return mvSave;
					
		} catch (IllegalArgumentException e) {
			errors.reject("dataCompra",null,e.getMessage());
			return new ModelAndView(VIEW_CADASTRO);
		}
	}
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView pesquisar(@ModelAttribute("filtro") PacoteFilter filtro) {

		ModelAndView mv = new ModelAndView("pesquisa");
		mv.addObject("listaPacotes", service.filtrarTitulos(filtro)); /*Chamado via @ModelAttribute*/		
		return mv;
	} 
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public ModelAndView editar(@PathVariable("id") Pacote pacote) {

		// Ao usar o PathVariable informando o campo chave e usando o Objeto a ser localizado no param
		// o Spring Data JPA realizar um FindOne sem precisar de implementação.
		
		//Optional<Titulo> titulo = repository.findById(codigo);
		ModelAndView mv = new ModelAndView(VIEW_CADASTRO);
		mv.addObject(pacote);		
		return mv;
	}
	
	
	@RequestMapping(value="{id}", method=RequestMethod.DELETE)
	public String deletar(@PathVariable Long id, RedirectAttributes attributes) {
		service.excluir(id);
		attributes.addFlashAttribute("mensagem", "Pacote Excluído com Sucesso!");
		return "redirect:/pacotes";	
	}
	
	
	@RequestMapping(value="/{id}/receber", method = RequestMethod.PUT)
	public @ResponseBody String receberPacotes(@PathVariable("id") Long id) {		
		return service.receber(id);
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
