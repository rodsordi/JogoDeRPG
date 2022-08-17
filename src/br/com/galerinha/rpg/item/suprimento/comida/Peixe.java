package br.com.galerinha.rpg.item.suprimento.comida;

import br.com.galerinha.rpg.efeito.Cura;
import br.com.galerinha.rpg.efeito.Efeito;
import br.com.galerinha.rpg.item.suprimento.Suprimento;

public class Peixe extends Suprimento {

	public Peixe() {
		super("Peixe");
	}
	
	@Override
	public Efeito obterEfeito() {
		return new Cura(3);
	}
	
}
