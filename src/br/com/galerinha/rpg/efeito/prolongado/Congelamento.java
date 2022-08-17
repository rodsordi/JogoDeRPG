package br.com.galerinha.rpg.efeito.prolongado;

import br.com.galerinha.rpg.afetavel.Afetavel;
import br.com.galerinha.rpg.afetavel.prolongadamente.Congelavel;

public class Congelamento extends EfeitoProlongado {

	public Congelamento() {
		super(3);
	}

	@Override
	public void aplicar(Afetavel alvo) {
		if (alvo instanceof Congelavel)
			((Congelavel)alvo).adicionarEfeito(this);
	}

}
