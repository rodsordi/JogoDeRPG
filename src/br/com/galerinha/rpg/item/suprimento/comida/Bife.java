package br.com.galerinha.rpg.item.suprimento.comida;

import br.com.galerinha.rpg.efeito.Cura;
import br.com.galerinha.rpg.efeito.Efeito;

public class Bife extends Comida {

	public Bife() {
		super("Bife");
	}

	@Override
	public Efeito obterEfeito() {
		return new Cura(5);
	}
	
}
