package br.com.galerinha.rpg.bebida;

import java.util.List;

import br.com.galerinha.rpg.afetavel.Afetavel;
import br.com.galerinha.rpg.efeito.Efeito;

interface Envenenavel extends Afetavel {

	void envenenar();
	
	List<Efeito> obterEfeitosAtivos();
	
}
