package negocio.entidades;

public class Item {
	
	private int id = 0;
	private Livro livro;
	private int quantidade;
	private static int contador = 0;
	
	public Item(Livro livro, int quantidade) {
		Item.contador++;
		this.livro = livro;
		this.quantidade = quantidade;
		this.id = contador;
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
		//ser� modificado
	}
	
	public Item consultar() {
		Item item = null;
		return item;
		//ser� modificado
	}
	
	public void remover() {
		//ser� modificado
	}
	
	public void atualizar() {
		//ser� modificado
	}
}



