package br.com.galerinha.rpg.magia;

import br.com.galerinha.rpg.afetavel.Afetavel;
import br.com.galerinha.rpg.efeito.Efeito;

public abstract class Magia {

	private final String nome;
	private final Efeito efeito;

	public Magia(String nome, Efeito efeito) {
		this.nome = nome;
		this.efeito = efeito;
	}
	
	public void conjurar(Afetavel alvo) {
		efeito.aplicar(alvo);
	}
	
	public String obterNome() {
		return nome;
	}
	
}
