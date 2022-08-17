package br.com.galerinha.rpg.personagem.npc.monstro.dragao;

import br.com.galerinha.rpg.personagem.npc.monstro.Monstro;

public abstract class Dragao extends Monstro {
	
	private enum Saliva { FOGO, ACIDO, RAIO, GELO };

	private Saliva saliva;
	
	public Dragao(int id, String nome, int vidaMaxima) {
		super(id, nome, vidaMaxima);
	}
	
	public void cuspir() {
		
	}

}
