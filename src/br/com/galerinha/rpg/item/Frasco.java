package br.com.galerinha.rpg.item;

import java.text.MessageFormat;

import br.com.galerinha.rpg.efeito.Efeito;
import br.com.galerinha.rpg.item.suprimento.Suprimento;
import br.com.galerinha.rpg.pocao.Pocao;

public class Frasco extends Suprimento {
	
	private Pocao pocao;

	public Frasco(Pocao pocao) {
		super(MessageFormat.format("Garrafa de {0}", pocao.obterNome()));
	}

	@Override
	public Efeito obterEfeito() {
		return pocao.obterEfeito();
	}

}
