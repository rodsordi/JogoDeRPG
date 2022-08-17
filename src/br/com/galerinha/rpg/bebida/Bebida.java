package br.com.galerinha.rpg.bebida;

import br.com.galerinha.rpg.item.Consumivel;

public abstract class Bebida implements Consumivel {
	
	private final String nome;
	
	public Bebida(String nome) {
		this.nome = nome;
	}
	
	public String obterNome() {
		return nome;
	}
	
}
