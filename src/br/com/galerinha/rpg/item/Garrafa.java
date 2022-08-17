package br.com.galerinha.rpg.item;

import java.text.MessageFormat;

import br.com.galerinha.rpg.bebida.Bebida;
import br.com.galerinha.rpg.efeito.Efeito;
import br.com.galerinha.rpg.item.suprimento.Suprimento;

public class Garrafa extends Suprimento {
	
	private Bebida bebida;

	public Garrafa(Bebida bebida) {
		super(MessageFormat.format("Garrafa de {0}", bebida.obterNome()));
	}

	@Override
	public Efeito obterEfeito() {
		return bebida.obterEfeito();
	}

}
