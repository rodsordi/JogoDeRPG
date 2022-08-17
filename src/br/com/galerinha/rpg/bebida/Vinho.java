package br.com.galerinha.rpg.bebida;

import br.com.galerinha.rpg.efeito.Cura;
import br.com.galerinha.rpg.efeito.Efeito;

public class Vinho extends Bebida {

	public Vinho() {
		super("Vinho");
	}
	
	@Override
	public Efeito obterEfeito() {
		return new Cura(5);
	}
	
}
