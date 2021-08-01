package br.com.prmarinho.correios.enums;

public enum CategoriaPacote {
	
	COLECINAVEIS("Colecionáveis"),
	GAMES("Games"),
	LIVROS("Livros"),
	CARRO("Carro"),
	ESCRITORIO("Escritório"),
	FERRAMENTAS("Ferramentas"),
	ELETRONICOS("Eletrônicos");
	
	private String descricao;
	
	CategoriaPacote(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	

}
