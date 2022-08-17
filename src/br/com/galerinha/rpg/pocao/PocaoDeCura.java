package br.com.galerinha.rpg.pocao;

import br.com.galerinha.rpg.efeito.Cura;
import br.com.galerinha.rpg.efeito.Efeito;

public class PocaoDeCura extends Pocao {
	
	public PocaoDeCura() {
		super("Pocao de Cura");
	}

	@Override
	public Efeito obterEfeito() {
		return new Cura(3);
	}
	
}
