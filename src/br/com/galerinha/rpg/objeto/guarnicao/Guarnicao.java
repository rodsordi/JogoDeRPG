package br.com.galerinha.rpg.objeto.guarnicao;

import br.com.galerinha.rpg.objeto.Objeto;

public abstract class Guarnicao<T> extends Objeto {
	
	public Guarnicao(String nome) {
		super(nome);
	}
	
	public abstract T abrir();
	
}
