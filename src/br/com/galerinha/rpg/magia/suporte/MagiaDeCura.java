package br.com.galerinha.rpg.magia.suporte;

import br.com.galerinha.rpg.efeito.Cura;

public class MagiaDeCura extends MagiaDeSuporte {
	
	public MagiaDeCura() {
		super("Magia de Cura", new Cura(5));
	}
	
}
