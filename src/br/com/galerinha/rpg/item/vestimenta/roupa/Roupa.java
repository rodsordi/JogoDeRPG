package br.com.galerinha.rpg.item.vestimenta.roupa;

import br.com.galerinha.rpg.efeito.Efeito;
import br.com.galerinha.rpg.item.vestimenta.Vestimenta;

public abstract class Roupa extends Vestimenta {

	public Roupa(String nome, double tamanho) {
		super(nome, tamanho);
	}
	
	public Roupa(String nome, double tamanho, Efeito efeito) {
		super(nome, tamanho, efeito);
	}

}
