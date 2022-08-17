package br.com.galerinha.rpg.pocao;

import br.com.galerinha.rpg.efeito.Dissipacao;
import br.com.galerinha.rpg.efeito.Efeito;
import br.com.galerinha.rpg.efeito.prolongado.Cegueira;

public class Colirio extends Pocao {
	
	public Colirio() {
		super("Colirio");
	}

	@Override
	public Efeito obterEfeito() {
		return new Dissipacao(Cegueira.class);
	}
	
}
