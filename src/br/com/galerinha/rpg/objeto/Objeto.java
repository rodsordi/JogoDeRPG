package br.com.galerinha.rpg.objeto;

public class Objeto {
	
	private final String nome;
	
	public Objeto(String nome) {
		this.nome = nome;
	}
	
	public String obterNome() {
		return nome;
	}
	
}
