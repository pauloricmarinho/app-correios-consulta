package br.com.prmarinho.correios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.prmarinho.correios.model.Pacote;

public interface PacoteRepository extends JpaRepository<Pacote, Long> {

	public List<Pacote> findByDescricaoContaining(String descricao);
}
