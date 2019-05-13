package dados;

import negocio.entidades.Item;

public interface RepositorioItens {

	public void cadastrar(Item item);
	public Item consultar(int id);
	public void remover(int id);
	
}
