package br.com.galerinha.rpg.afetavel.prolongadamente;

import java.util.Set;

import br.com.galerinha.rpg.afetavel.Afetavel;
import br.com.galerinha.rpg.efeito.prolongado.EfeitoProlongado;

public interface AfetavelProlongadamente extends Afetavel {
	
	Set<EfeitoProlongado> obterEfeitosAtivos();
	
	default void adicionarEfeito(EfeitoProlongado efeito) {
		obterEfeitosAtivos().add(efeito);
	}
	
	default void processarEfeitos() {
		for (EfeitoProlongado efeito : obterEfeitosAtivos()) {
			if (efeito.estaDuracaoFinalizada())
				dissiparEfeito(efeito);
			efeito.processarDuracao();
		}
	}
	
	default void dissiparEfeito(Class<? extends EfeitoProlongado> efeito) {
		for (var efeitoProlongado : obterEfeitosAtivos())
			if (efeito.isInstance(efeitoProlongado))
				dissiparEfeito(efeitoProlongado);
	}
	
	default void dissiparEfeito(EfeitoProlongado efeito) {
		obterEfeitosAtivos().remove(efeito);
	}
	
}
