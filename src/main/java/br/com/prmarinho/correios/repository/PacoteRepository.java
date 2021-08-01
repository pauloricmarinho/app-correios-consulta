package br.com.prmarinho.correios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.prmarinho.correios.model.Pacote;

public interface PacoteRepository extends JpaRepository<Pacote, String> {

	public List<Pacote> findByDescricaoContaining(String descricao);
}
