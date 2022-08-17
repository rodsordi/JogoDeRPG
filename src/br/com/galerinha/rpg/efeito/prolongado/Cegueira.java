package br.com.galerinha.rpg.efeito.prolongado;

import br.com.galerinha.rpg.afetavel.Afetavel;
import br.com.galerinha.rpg.afetavel.prolongadamente.Cegavel;

public class Cegueira extends EfeitoProlongado {

	public Cegueira() {
		super(3);
	}

	@Override
	public void aplicar(Afetavel alvo) {
		if (alvo instanceof Cegavel)
			((Cegavel)alvo).adicionarEfeito(this);
	}

	
	
}
