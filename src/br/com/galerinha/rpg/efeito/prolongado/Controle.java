package br.com.galerinha.rpg.efeito.prolongado;

import br.com.galerinha.rpg.afetavel.Afetavel;
import br.com.galerinha.rpg.afetavel.prolongadamente.Controlavel;

public class Controle extends EfeitoProlongado {

	public Controle() {
		super(3);
	}

	@Override
	public void aplicar(Afetavel alvo) {
		if (alvo instanceof Controlavel)
			((Controlavel)alvo).adicionarEfeito(this);
	}
 
}
