package br.com.galerinha.rpg.efeito;

import br.com.galerinha.rpg.afetavel.Afetavel;
import br.com.galerinha.rpg.afetavel.Eletrocutavel;

public class Choque extends Efeito {
	
	private final int dano;
	
	public Choque(int dano) {
		this.dano = dano;
	}

	@Override
	public void aplicar(Afetavel alvo) {
		if (alvo instanceof Eletrocutavel)
			((Eletrocutavel)alvo).receberChoque(dano);
	}

}
