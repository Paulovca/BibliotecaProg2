package negocio.exception.livro;

import negocio.entidades.Item;

public class LivroNaoEmprestavelException extends Exception {

	private Item item;

	public LivroNaoEmprestavelException(Item item) {
		super("Estoque insuficiente!");
		this.item = item;
	}

	public Item getItem() {
		return item;
	}

}
