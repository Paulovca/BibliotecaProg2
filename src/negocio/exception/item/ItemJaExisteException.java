package negocio.exception.item;

import negocio.entidades.Livro;

public class ItemJaExisteException extends Exception{
	
	private Livro livro;
	private int quantidade;
	
	public ItemJaExisteException(Livro livro, int quantidade) {
		super("Item ja existe!");
		this.livro = livro;
		this.quantidade = quantidade;
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public int getQuatidade(){
		return quantidade;
	}
}
