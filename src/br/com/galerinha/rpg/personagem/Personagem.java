package br.com.galerinha.rpg.personagem;

import java.util.HashSet;
import java.util.Set;

import br.com.galerinha.rpg.afetavel.Curavel;
import br.com.galerinha.rpg.afetavel.Danificavel;
import br.com.galerinha.rpg.afetavel.Eletrocutavel;
import br.com.galerinha.rpg.afetavel.Levitavel;
import br.com.galerinha.rpg.afetavel.prolongadamente.Cegavel;
import br.com.galerinha.rpg.afetavel.prolongadamente.Congelavel;
import br.com.galerinha.rpg.afetavel.prolongadamente.Envenenavel;
import br.com.galerinha.rpg.afetavel.prolongadamente.Inflamavel;
import br.com.galerinha.rpg.efeito.prolongado.EfeitoProlongado;

public abstract class Personagem
		implements Curavel, Danificavel, Congelavel, Inflamavel, Envenenavel, Cegavel, Eletrocutavel, Levitavel {

	private final Set<EfeitoProlongado> efeitosAtivos = new HashSet<>();
	private final String nome;
	private int vidaMaxima;
	private int vidaAtual;
	
	protected int forca;
	protected int inteligencia;
	protected int agilidade;

	public Personagem(String nome, int vidaMaxima) {
		this.nome = nome;
		this.vidaMaxima = vidaMaxima;
		vidaAtual = vidaMaxima;
	}
	
	public void atacar(Danificavel alvo) {
		alvo.receberDano(forca);
	}

	@Override
	public void receberDano(int dano) {
		this.vidaAtual -= dano;
	}

	@Override
	public void receberCura(int cura) {
		this.vidaAtual += cura;
	}

	@Override
	public Set<EfeitoProlongado> obterEfeitosAtivos() {
		return efeitosAtivos;
	}

	@Override
	public void levitar() {
		
	}

	@Override
	public void receberChoque(int dano) {
		receberDano(dano);
	}

	@Override
	public void ativarVeneno(int dano) {
		receberDano(dano);
	}

	@Override
	public void ativarCombustao(int dano) {
		receberDano(dano);
	}
	
	public String obterNome() {
		return nome;
	}

	public int obterVidaAtual() {
		return vidaAtual;
	}

	public int obterVidaMaxima() {
		return vidaMaxima;
	}

	@Override
	public String toString() {
		return "Personagem [nome=" + nome + ", vidaMaxima=" + vidaMaxima
				+ ", vidaAtual=" + vidaAtual + ", forca=" + forca + ", inteligencia=" + inteligencia + ", agilidade="
				+ agilidade + "]";
	}

}
