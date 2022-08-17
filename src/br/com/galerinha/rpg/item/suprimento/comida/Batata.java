package br.com.galerinha.rpg.item.suprimento.comida;

import br.com.galerinha.rpg.efeito.Cura;
import br.com.galerinha.rpg.efeito.Efeito;

public class Batata extends Comida {

	public Batata() {
		super("Batata");
	}

	@Override
	public Efeito obterEfeito() {
		return new Cura(1);
	}
	
}
