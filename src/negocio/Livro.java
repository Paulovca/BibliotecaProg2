package negocio;

public class Livro {
	
	private int id;
	private String titulo;
	private String autor;
	private int exemplar;
	
	Livro(int id, String titulo, String autor, int exemplar){
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.exemplar = exemplar;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getExemplar() {
		return exemplar;
	}

	public void setExemplar(int exemplar) {
		this.exemplar = exemplar;
	}
	
	public void Cadastrar() {
		//ser� modificado
	}
	
	public Livro Consultar() {
		Livro livro = null;
		return livro;
		//ser� modificado
	}
	
	public void Remover() {
		//ser� modificado
	}
	
	public void Atualizar() {
		//ser� modificado
	}
	
	public void AtualizarExemplar() {
		//recebe um par�metro
		//ser� modificado
	}
}








