package br.com.galerinha.rpg.efeito.prolongado;

import br.com.galerinha.rpg.efeito.Efeito;

public abstract class EfeitoProlongado extends Efeito {
	
	private int duracaoAtual = 0;
	private final int duracaoMaxima;
	
	public EfeitoProlongado(int duracao) {
		this.duracaoMaxima = duracao;
	}
	
	public void processarDuracao() {
		duracaoAtual++;
	}
	
	public boolean estaDuracaoFinalizada() {
		return duracaoAtual >= duracaoMaxima;
	}
	
	public int obterDuracaoAtual() {
		return duracaoAtual;
	}
	
	public int obterDuracaoMaxima() {
		return duracaoMaxima;
	}
	
}
