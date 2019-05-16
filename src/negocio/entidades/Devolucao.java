package negocio.entidades;

import java.util.Calendar;
import java.util.Date;

public class Devolucao {
	
	private int id = 0;
	private static int contador = 0;
	private Aluno aluno;
	private Item[] itens;
	private Funcionario funcionario;
	private Calendar dataDevolucao = Calendar.getInstance();
	private float multa;
	
	public Devolucao(Aluno aluno, Item[] itens, Funcionario funcionario, Calendar dataDevolucao) {
		Devolucao.contador ++;
		this.aluno = aluno;
		this.itens = itens;
		this.funcionario = funcionario;
		this.dataDevolucao = dataDevolucao;
		this.multa = 0;
		this.id = contador;

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

	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Calendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public int getId() {
		return id;
	}

	public static int getContador() {
		return contador;
	}

	public float getMulta() {
		return multa;
	}

	public void setMulta(float multa) {
		this.multa = multa;
	}
	
	public void CalcularMulta(Calendar dataDevolucao) {
		
	}
}
