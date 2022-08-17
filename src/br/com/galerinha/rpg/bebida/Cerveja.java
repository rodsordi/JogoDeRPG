package br.com.galerinha.rpg.bebida;

import br.com.galerinha.rpg.efeito.Cura;
import br.com.galerinha.rpg.efeito.Efeito;

public class Cerveja extends Bebida {

	public Cerveja() {
		super("Cerveja");
	}

	@Override
	public Efeito obterEfeito() {
		return new Cura(5);
	}
	
}
