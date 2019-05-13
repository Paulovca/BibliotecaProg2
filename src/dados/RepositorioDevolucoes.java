package dados;

import java.util.Date;

import negocio.entidades.Devolucao;


public interface RepositorioDevolucoes {

	public void cadastrar(Devolucao devolucoes);
	public Devolucao consultar(Date dataDevolucao);
	public Devolucao remover(Date dataDevolucao);

}
