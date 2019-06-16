package dados;

import java.util.ArrayList;

import negocio.entidades.Devolucao;


public interface RepositorioDevolucoes {

	public void cadastrar(Devolucao devolucao);
	public void remover(int id);
	public Devolucao consultar(int id);
	public ArrayList<Devolucao> listar();
	public ArrayList<Devolucao> procurarDevolucoes(String cpf);
	public void salvarArquivo();
}
