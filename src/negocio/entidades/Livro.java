package negocio.entidades;

public class Livro {
	
	private int id = 0;
	private String titulo;
	private String autor;
	private int estoque;
	private static int contador = 0;
	
	public Livro(String titulo, String autor, int estoque){
		Livro.contador++;
		this.titulo = titulo;
		this.autor = autor;
		this.estoque = estoque;
		this.id = contador;
	}
	
	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getestoque() {
		return estoque;
	}

	public void setestoque(int estoque) {
		this.estoque = estoque;
	}
	
	public void cadastrar() {
		//ser� modificado
	}
	
	public Livro consultar() {
		Livro livro = null;
		return livro;
		//ser� modificado
	}
	
	public void remover() {
		//ser� modificado
	}
	
	public void atualizar() {
		//ser� modificado
	}
	
	public void atualizar_estoque() {
		//recebe um par�metro
		//ser� modificado
	}
}


