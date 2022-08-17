package br.com.galerinha.rpg.item.arma.espada;

import br.com.galerinha.rpg.efeito.Efeito;
import br.com.galerinha.rpg.item.arma.Arma;

public abstract class Espada extends Arma {
	
	public Espada(String nome, double tamanho) {
		super(nome, tamanho);
	}
	
	public Espada(String nome, double tamanho, Efeito efeito) {
		super(nome, tamanho, efeito);
	}
	
}
