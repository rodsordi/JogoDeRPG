package br.com.galerinha.rpg.personagem.npc;

import br.com.galerinha.rpg.personagem.Personagem;

public abstract class NPC extends Personagem {

	public NPC(String nome, int vidaMaxima) {
		super(nome, vidaMaxima);
	}
	
	public void fugir() {
		
	}

}
