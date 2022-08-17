package br.com.galerinha.rpg.personagem.npc;

import br.com.galerinha.rpg.item.Item;

public class Vendedor extends NPC {

	public Vendedor(String nome, int vidaMaxima) {
		super(nome, vidaMaxima);
	}
	
	public Item vender(int id) {
		return null;
	}
	
	public int comprar(Item item) {
		return 0;
	}

}
