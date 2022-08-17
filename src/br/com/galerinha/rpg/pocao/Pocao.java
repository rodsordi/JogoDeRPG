package br.com.galerinha.rpg.pocao;

import br.com.galerinha.rpg.item.Consumivel;

public abstract class Pocao implements Consumivel {

	private String nome;

	public Pocao(String nome) {
		this.nome = nome;
	}

	public String obterNome() {
		return nome;
	}

}
