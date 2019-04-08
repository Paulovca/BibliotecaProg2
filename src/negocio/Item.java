package negocio;

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
	
	public void Cadastrar() {
		//será modificado
	}
	
	public Item Consultar() {
		Item item = null;
		return item;
		//será modificado
	}
	
	public void Remover() {
		//será modificado
	}
	
	public void Atualizar() {
		//será modificado
	}
}





