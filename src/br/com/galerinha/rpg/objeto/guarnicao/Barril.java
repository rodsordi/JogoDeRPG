package br.com.galerinha.rpg.objeto.guarnicao;

import java.text.MessageFormat;

import br.com.galerinha.rpg.bebida.Bebida;

public class Barril extends Guarnicao<Bebida> {
	
	private Bebida bebida;

	public Barril(Bebida bebida) {
		super(MessageFormat.format("Barril de {0}", bebida.obterNome()));
		this.bebida = bebida;
	}

	@Override
	public Bebida abrir() {
		return bebida;
	}

}
