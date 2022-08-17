package br.com.galerinha.rpg.pocao;

import br.com.galerinha.rpg.efeito.Dissipacao;
import br.com.galerinha.rpg.efeito.Efeito;
import br.com.galerinha.rpg.efeito.prolongado.Envenenamento;

public class Antidoto extends Pocao {
	
	public Antidoto() {
		super("Antidoto");
	}

	@Override
	public Efeito obterEfeito() {
		return new Dissipacao(Envenenamento.class);
	}
	
}
