package br.com.galerinha.rpg.efeito;

import br.com.galerinha.rpg.afetavel.Afetavel;
import br.com.galerinha.rpg.afetavel.prolongadamente.AfetavelProlongadamente;
import br.com.galerinha.rpg.efeito.prolongado.EfeitoProlongado;

public class Dissipacao extends Efeito {

	public final Class<? extends EfeitoProlongado> efeitoProlongado;
	
	public Dissipacao(Class<? extends EfeitoProlongado> efeitoProlongado) {
		this.efeitoProlongado = efeitoProlongado;
	}
	
	@Override
	public void aplicar(Afetavel alvo) {
		if (alvo instanceof AfetavelProlongadamente)
			((AfetavelProlongadamente)alvo).dissiparEfeito(efeitoProlongado);
	}

}
