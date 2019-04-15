package negocio.entidades;

public class Item {
	
	private Livro livro;
	private int quantidade;
	
	public Item(Livro livro, int quantidade) {
		this.livro = livro;
		this.quantidade = quantidade;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void cadastrar() {
		//será modificado
	}
	
	public Item consultar() {
		Item item = null;
		return item;
		//será modificado
	}
	
	public void remover() {
		//será modificado
	}
	
	public void atualizar() {
		//será modificado
	}
}



