package br.com.galerinha.rpg.magia.suporte;

import br.com.galerinha.rpg.efeito.Dissipacao;

public class MagiaDeDissipacao extends MagiaDeSuporte {

	public MagiaDeDissipacao() {
		super("Desencanto", new Dissipacao(null));
	}

}
