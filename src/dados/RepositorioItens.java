package dados;

import negocio.entidades.Item;

public interface RepositorioItens {

	public void cadastrar(Item item);
	public void remover(int id);
	public Item consultar(int id);
	public void salvarArquivo();
}
