package br.com.galerinha.rpg.item.suprimento;

import br.com.galerinha.rpg.item.Consumivel;
import br.com.galerinha.rpg.item.Item;

public abstract class Suprimento extends Item implements Consumivel {

	public Suprimento(String nome) {
		super(nome, 1);
	}

}
