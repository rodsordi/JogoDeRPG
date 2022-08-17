package br.com.galerinha.rpg.item;

import br.com.galerinha.rpg.efeito.Efeito;

public abstract class Item {
	
	private final String nome;
	private final double tamanho;
	private Efeito efeito;
	
	public Item(String nome, double tamanho) {
		this(nome, tamanho, null);
	}
	
	public Item(String nome, double tamanho, Efeito efeito) {
		this.nome = nome;
		this.tamanho = tamanho;
		this.efeito = efeito;
	}
	
	public String obterNome() {
		return nome;
	}
	
	public double obterTamanho() {
		return tamanho;
	}
	
	public Efeito obterEfeito() {
		return efeito;
	}
	
}
