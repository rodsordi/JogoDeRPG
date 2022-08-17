package br.com.galerinha.rpg.app;

import br.com.galerinha.rpg.personagem.heroi.Heroi;
import br.com.galerinha.rpg.personagem.heroi.Mago;
import br.com.galerinha.rpg.personagem.npc.monstro.Monstro;
import br.com.galerinha.rpg.personagem.npc.monstro.goblinoide.Goblin;

public class Batalha {
	
	private Heroi heroi;
	private Monstro monstro;

	public static void main(String[] args) {
		Batalha batalha = new Batalha();
		
		if (args[0].equals("mago"))
			batalha.heroi = new Mago("Rodrigo");
		
		
		if (args[1].equals("goblin"))
			batalha.monstro = new Goblin(1);

		
		batalha.comecar();
	}
	
	public void comecar() {
		System.out.println("Criado: " + heroi);

		//monstro.xingar(heroi);
		System.out.println("Criado: " + monstro);

		System.out.println(String.format("%s ataca %s", heroi.obterNome(), monstro.obterNome()));

		if (heroi instanceof Mago) {
			Mago mago = (Mago) heroi;
			mago.prepararMagia();
			mago.conjurarMagia(monstro);
//		heroi.atacar(goblin1);
			System.out.println(monstro.obterNome() + " ficou com " + monstro.obterVidaAtual() + " de vida");
		}

		System.out.println(String.format("%s ataca %s", monstro.obterNome(), heroi.obterNome()));
		monstro.atacar(heroi);
		System.out.println(heroi.obterNome() + " ficou com " + heroi.obterVidaAtual() + " de vida");

		System.out.println("Final de jogo");
	}

}
