package br.com.galerinha.rpg.efeito;

import br.com.galerinha.rpg.afetavel.Afetavel;
import br.com.galerinha.rpg.afetavel.Danificavel;

public class Dano extends Efeito {

	private final int valor;
	private Efeito efeito;
	
	public Dano(int valor) {
		this.valor = valor;
	}
	
	public Dano(int valor, Efeito efeito) {
		this.valor = valor;
		this.efeito = efeito;
	}

	@Override
	public void aplicar(Afetavel alvo) {
		if (alvo instanceof Danificavel)
			((Danificavel)alvo).receberDano(valor);
		
		if (efeito != null)
			efeito.aplicar(alvo);
	}

}
