package dados;

import java.util.Date;

import negocio.entidades.Devolucao;


public interface RepositorioDevolucoes {

	public void cadastrar(Devolucao devolucao);
	public void remover(int id);
	public Devolucao consultar(int id);
}
