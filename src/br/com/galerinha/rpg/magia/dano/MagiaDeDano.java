package br.com.galerinha.rpg.magia.dano;

import br.com.galerinha.rpg.efeito.Dano;
import br.com.galerinha.rpg.efeito.Efeito;
import br.com.galerinha.rpg.magia.Magia;

public abstract class MagiaDeDano extends Magia {

	public MagiaDeDano(String nome, int dano, Efeito efeito) {
		super(nome, new Dano(dano, efeito));
	}

}
