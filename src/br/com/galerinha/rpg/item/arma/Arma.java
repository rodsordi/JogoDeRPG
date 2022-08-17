package br.com.galerinha.rpg.item.arma;

import br.com.galerinha.rpg.efeito.Efeito;
import br.com.galerinha.rpg.item.Item;

public abstract class Arma extends Item {

	public Arma(String nome, double tamanho) {
		super(nome, tamanho);
	}
	
	public Arma(String nome, double tamanho, Efeito efeito) {
		super(nome, tamanho, efeito);
	}

}
