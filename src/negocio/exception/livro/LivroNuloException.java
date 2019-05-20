package negocio.exception.livro;

public class LivroNuloException extends Exception{
	
	private String autor;
	private String titulo;
	
	public LivroNuloException(String autor, String titulo) {
		super("Autor e/ou Título não preenchidos!");
		this.autor = autor;
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}
	
}
