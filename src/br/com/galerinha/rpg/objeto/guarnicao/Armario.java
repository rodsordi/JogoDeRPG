package br.com.galerinha.rpg.objeto.guarnicao;

import br.com.galerinha.rpg.item.vestimenta.Vestimenta;

public class Armario extends Guarnicao<Vestimenta[]> {

	private Vestimenta[] vestimentas;

	public Armario(Vestimenta... vestimentas) {
		super("Armário");
		this.vestimentas = new Vestimenta[8];

		for (int i = 0; i < this.vestimentas.length; i++)
			if (i < vestimentas.length)
				this.vestimentas[i] = vestimentas[i];
	}

	@Override
	public Vestimenta[] abrir() {
		return vestimentas;
	}

}
