package br.com.galerinha.rpg.item.arma.machado;

import br.com.galerinha.rpg.efeito.Efeito;
import br.com.galerinha.rpg.item.arma.Arma;

public abstract class Machado extends Arma {

	public Machado(String nome, double tamanho) {
		super(nome, tamanho);
	}
	
	public Machado(String nome, double tamanho, Efeito efeito) {
		super(nome, tamanho, efeito);
	}
	
}
