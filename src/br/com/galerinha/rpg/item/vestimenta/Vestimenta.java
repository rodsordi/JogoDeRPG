package br.com.galerinha.rpg.item.vestimenta;

import br.com.galerinha.rpg.efeito.Efeito;
import br.com.galerinha.rpg.item.Item;

public abstract class Vestimenta extends Item {
	
	private int defesa;

	public Vestimenta(String nome, double tamanho) {
		super(nome, tamanho);
	}
	
	public Vestimenta(String nome, double tamanho, Efeito efeito) {
		super(nome, tamanho, efeito);
	}
	
	public int obterDefesa() {
		return defesa;
	}
	
}
