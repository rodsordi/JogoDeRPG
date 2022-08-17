package br.com.galerinha.rpg.item.arma.espada;

import br.com.galerinha.rpg.efeito.prolongado.Combustao;

public class EspadaDeFogo extends Espada {
	
	public EspadaDeFogo() {
		super("Espada de Fogo", 10, new Combustao());
	}
	
}
