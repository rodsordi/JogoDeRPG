package br.com.galerinha.rpg.efeito.prolongado;

import br.com.galerinha.rpg.afetavel.Afetavel;
import br.com.galerinha.rpg.afetavel.prolongadamente.Envenenavel;

public class Envenenamento extends EfeitoProlongado {

	public Envenenamento() {
		super(3);
	}

	@Override
	public void aplicar(Afetavel alvo) {
		if (alvo instanceof Envenenavel)
			((Envenenavel)alvo).adicionarEfeito(this);
	}

}
