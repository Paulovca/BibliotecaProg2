package negocio.entidades;

import java.sql.Date;
import java.util.Calendar;

public class Emprestimo {
	
	private int id = 0;
	private static int contador = 0;
	private Aluno aluno;
	private Item itens[] = new Item[5];
	private Funcionario funcionario;
	private Calendar dataEmprestimo = Calendar.getInstance();
	private Calendar dataDevolucao = Calendar.getInstance();
	
	

	public Emprestimo(int id, Aluno aluno, Item[] itens, Funcionario funcionario, Calendar dataEmprestimo, Calendar dataDevolucao) {
		Emprestimo.contador ++;
		this.id = contador;
		this.aluno = aluno;
		this.itens = itens;
		this.funcionario = funcionario;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Item[] getItens() {
		return itens;
	}

	public void setItens(Item[] itens) {
		this.itens = itens;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Calendar getDataEmpretimo() {
		return dataEmprestimo;
	}

	public void setDataEmpretimo(Calendar dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Calendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public int getId() {
		return id;
	}

}
