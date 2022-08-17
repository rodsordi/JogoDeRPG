package br.com.galerinha.rpg.efeito.prolongado;

import br.com.galerinha.rpg.afetavel.Afetavel;
import br.com.galerinha.rpg.afetavel.prolongadamente.Inflamavel;

public class Combustao extends EfeitoProlongado {

	public Combustao() {
		super(3);
	}

	@Override
	public void aplicar(Afetavel alvo) {
		if (alvo instanceof Inflamavel)
			((Inflamavel)alvo).adicionarEfeito(this);
	}

}
