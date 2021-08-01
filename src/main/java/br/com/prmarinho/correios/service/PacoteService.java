package br.com.prmarinho.correios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.prmarinho.correios.enums.StatusPacote;
import br.com.prmarinho.correios.model.Pacote;
import br.com.prmarinho.correios.repository.PacoteRepository;
import br.com.prmarinho.correios.repository.filter.PacoteFilter;

@Service
public class PacoteService {

	@Autowired
	private PacoteRepository repository;
	
	public void salvar(Pacote pacote) {
		try {
			repository.save(pacote);
		}catch (DataIntegrityViolationException e) {
			throw new IllegalArgumentException("Formato de Data Inválido...");
		}
	}
	
	public void excluir(Long codigo) {
		repository.deleteById(codigo);
	}
	
	public String receber(Long codigo) {
		Pacote pacote = repository.findById(codigo).get();
		pacote.setStatus(StatusPacote.RECEBIDO);
		repository.save(pacote);
		
		return StatusPacote.RECEBIDO.getDescricao();
	}
	
	public List<Pacote> filtrarTitulos(PacoteFilter filtro){
		String descricao = filtro.getDescricao() == null ? "" : filtro.getDescricao();
		return repository.findByDescricaoContaining(descricao);
	}
}
