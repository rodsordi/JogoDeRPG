package br.com.galerinha.rpg.personagem.npc.monstro.goblinoide;

import br.com.galerinha.rpg.personagem.Personagem;
import br.com.galerinha.rpg.personagem.npc.monstro.Monstro;

public abstract class Goblinoide extends Monstro {

	public Goblinoide(int id, String nome, int vidaMaxima) {
		super(id, nome, vidaMaxima);
	}
	
}
