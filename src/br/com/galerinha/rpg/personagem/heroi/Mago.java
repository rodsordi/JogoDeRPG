package br.com.galerinha.rpg.personagem.heroi;

import java.util.ArrayList;
import java.util.List;

import br.com.galerinha.rpg.afetavel.Afetavel;
import br.com.galerinha.rpg.item.vestimenta.roupa.Camisa;
import br.com.galerinha.rpg.item.vestimenta.roupa.Roupa;
import br.com.galerinha.rpg.magia.Magia;
import br.com.galerinha.rpg.magia.dano.BolaDeFogo;

public class Mago extends Heroi {
	
	private final List<Magia> magiasAprendidas = new ArrayList<>();
	private final List<Magia> grmorio = new ArrayList<>();
	private Magia magiaPreparada;
	private Roupa roupa;
	
	public Mago(String nome) {
		super(nome, 10);
		roupa = new Camisa();
		forca = 4;
	}
	
	public void prepararMagia() {
		magiaPreparada = new BolaDeFogo();
	}
	
	public void conjurarMagia(Afetavel alvo) {
		if (magiaPreparada != null)
			magiaPreparada.conjurar(alvo);
	}
	
}
