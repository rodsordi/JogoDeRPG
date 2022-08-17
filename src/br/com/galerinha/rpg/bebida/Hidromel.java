package br.com.galerinha.rpg.bebida;

import br.com.galerinha.rpg.efeito.Cura;
import br.com.galerinha.rpg.efeito.Efeito;

public class Hidromel extends Bebida {

	public Hidromel() {
		super("Hidromel");
	}
	
	@Override
	public Efeito obterEfeito() {
		return new Cura(1);
	}
	
}
