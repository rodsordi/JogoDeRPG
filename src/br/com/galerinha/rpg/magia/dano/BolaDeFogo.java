package br.com.galerinha.rpg.magia.dano;

import br.com.galerinha.rpg.efeito.prolongado.Combustao;

public class BolaDeFogo extends MagiaDeDano {

	public BolaDeFogo() {
		super("Bola de Fogo", 10, new Combustao());
	}

}
