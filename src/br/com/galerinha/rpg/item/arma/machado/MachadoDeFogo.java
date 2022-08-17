package br.com.galerinha.rpg.item.arma.machado;

import br.com.galerinha.rpg.efeito.prolongado.Combustao;

public class MachadoDeFogo extends Machado {
	
	public MachadoDeFogo() {
		super("Machado de Fogo", 10, new Combustao());
	}
	
}
