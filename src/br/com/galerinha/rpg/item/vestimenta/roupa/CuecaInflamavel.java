package br.com.galerinha.rpg.item.vestimenta.roupa;

import br.com.galerinha.rpg.efeito.prolongado.Combustao;

public class CuecaInflamavel extends Roupa {

	public CuecaInflamavel() {
		super("Cueca Inflamável", 10, new Combustao());
	}
	
}
