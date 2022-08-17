package br.com.galerinha.rpg.efeito;

import br.com.galerinha.rpg.afetavel.Afetavel;
import br.com.galerinha.rpg.afetavel.Curavel;

public class Cura extends Efeito {

	private final int valor;

	public Cura(int valor) {
		this.valor = valor;
	}
	
	public int obterValor() {
		return valor;
	}

	@Override
	public void aplicar(Afetavel alvo) {
		if (alvo instanceof Curavel)
			((Curavel)alvo).receberCura(valor);
	}

}
