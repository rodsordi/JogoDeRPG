package br.com.galerinha.rpg.item.arma.espada;

import br.com.galerinha.rpg.efeito.prolongado.Congelamento;

public class EspadaDeGelo extends Espada {
	
	public EspadaDeGelo() {
		super("Espada de Gelo", 10, new Congelamento());
	}
	
}
