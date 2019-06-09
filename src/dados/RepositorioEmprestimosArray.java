package dados;

import java.util.ArrayList;



import negocio.entidades.Emprestimo;

public class RepositorioEmprestimosArray implements RepositorioEmprestimos {

	private static RepositorioEmprestimosArray instance;
	private Emprestimo[] emprestimos;
	private int indice;
	
	private final static int TAMANHO = 200;
	
	private RepositorioEmprestimosArray() {
		this.emprestimos = new Emprestimo[TAMANHO];
		this.indice = 0;
	}
	
	public static RepositorioEmprestimosArray getInstance() {
		if(instance == null) {
			instance = new RepositorioEmprestimosArray();
		}
		return instance;
	}
	
	@Override
	public void cadastrar(Emprestimo emprestimo) {
		emprestimos[indice] = emprestimo;
		indice++;
	}

	@Override
	public void remover(int id) {
		for(int i = 0; i < indice ; i++) {
			if(emprestimos[i].getId() == id) {
				emprestimos[i] = emprestimos[indice];
				emprestimos[indice] = null;
			}
		}
	}
	
	@Override
	public Emprestimo consultar(int id) {
		Emprestimo emprestimo = null;
		for(int i = 0; i< indice ; i++) {
			if(emprestimos[i].getId() == id) {
				emprestimo = emprestimos[i];
			}
		}
		return emprestimo;
	}
	
	public ArrayList<Emprestimo> procurarEmprestimos(String cpf) {
		ArrayList<Emprestimo> emprestimo = new ArrayList<Emprestimo>();
		for(int i = 0; i< indice; i++) {
			if(emprestimos[i].getAluno().getCpf().equals(cpf)) {
				if(emprestimos[i].isDevolvido()==false) {
					emprestimo.add(emprestimos[i]);
				}
			}
		}
		return emprestimo;
	}
	
}
