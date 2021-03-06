package dados;

import java.util.ArrayList;

import negocio.entidades.Item;
import negocio.entidades.Livro;

public interface RepositorioLivros {

	public void cadastrar(Livro livro);

	public void remover(int id);

	public void atualizar(Livro livro);

	public Livro consultar(int id);

	public ArrayList<Livro> listar();

	public void salvarArquivo();

	public void atualizarEstoqueEmprestimo(Item item);

	public void atualizarEstoqueDevolucao(Item item);

	public boolean consultarEstoque(Item item);
}
