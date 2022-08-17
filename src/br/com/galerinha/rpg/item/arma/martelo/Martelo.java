package br.com.galerinha.rpg.item.arma.martelo;

import br.com.galerinha.rpg.efeito.Efeito;
import br.com.galerinha.rpg.item.arma.Arma;

public abstract class Martelo extends Arma {

	public Martelo(String nome, double tamanho) {
		super(nome, tamanho);
	}
	
	public Martelo(String nome, double tamanho, Efeito efeito) {
		super(nome, tamanho, efeito);
	}

}
