package br.com.galerinha.rpg.personagem.npc.monstro;

import br.com.galerinha.rpg.personagem.npc.NPC;

public abstract class Monstro extends NPC {
	
	public Monstro(int id, String nome, int vidaMaxima) {
		super(nome + id, vidaMaxima);
	}

}
