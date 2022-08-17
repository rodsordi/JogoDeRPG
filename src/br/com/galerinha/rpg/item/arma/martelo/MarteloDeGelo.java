package br.com.galerinha.rpg.item.arma.martelo;

import br.com.galerinha.rpg.efeito.prolongado.Congelamento;

public class MarteloDeGelo extends Martelo {
	
	public MarteloDeGelo() {
		super("Martelo de Gelo", 10, new Congelamento());
	}
	
}
