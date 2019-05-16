package negocio.entidades;

import java.sql.Date;
import java.util.Calendar;

public class Emprestimo {
	
	private int id = 0;
	private static int contador = 0;
	private Aluno aluno;
	private Item itens[] = new Item[5];
	private Funcionario funcionario;
	private Calendar dataEmpretimo = Calendar.getInstance();
	private Calendar dataDevolucao = Calendar.getInstance();
	
	

	public Emprestimo(int id, Aluno aluno, Item[] itens, Funcionario funcionario, Calendar dataEmpretimo, Calendar dataDevolucao) {
		Emprestimo.contador ++;
		this.id = contador;
		this.aluno = aluno;
		this.itens = itens;
		this.funcionario = funcionario;
		this.dataEmpretimo = dataEmpretimo;
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
		return dataEmpretimo;
	}

	public void setDataEmpretimo(Calendar dataEmpretimo) {
		this.dataEmpretimo = dataEmpretimo;
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
