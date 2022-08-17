package br.com.galerinha.rpg.magia.controle;

import br.com.galerinha.rpg.efeito.prolongado.Controle;
import br.com.galerinha.rpg.magia.Magia;

public abstract class MagiaDeControle extends Magia {

	public MagiaDeControle() {
		super("Magia de Controle", new Controle());
	}

}
