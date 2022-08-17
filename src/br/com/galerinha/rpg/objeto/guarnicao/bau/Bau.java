package br.com.galerinha.rpg.objeto.guarnicao.bau;

import br.com.galerinha.rpg.item.Item;
import br.com.galerinha.rpg.objeto.guarnicao.Guarnicao;

public abstract class Bau extends Guarnicao<Item[]> {

	private final Item[] itens;

	public Bau(String nome, int tamanho, Item... itens) {
		super(nome);
		this.itens = new Item[tamanho];

		for (int i = 0; i < this.itens.length; i++)
			if (i < itens.length)
				this.itens[i] = itens[i];
	}

	@Override
	public Item[] abrir() {
		return itens;
	}

}
