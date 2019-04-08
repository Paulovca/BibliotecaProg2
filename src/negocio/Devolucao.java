package negocio;

public class Devolucao {
	
	private Aluno aluno;
	private Item[] itens;
	private Funcionario funcionario;
	private Date dataDevolucao;
	private float multa;
	
	public Devolucao(Aluno aluno, Item[] itens, Funcionario funcionario, Date dataDevolucao, float multa) {
		this.aluno = aluno;
		this.itens = itens;
		this.funcionario = funcionario;
		this.dataDevolucao = dataDevolucao;
		this.multa = multa;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Item getItens() {
		return itens;
	}

	public void setItens(Item itens) {
		this.itens = itens;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public float getMulta() {
		return multa;
	}

	public void setMulta(float multa) {
		this.multa = multa;
	}
	
	public void Cadastrar() {
		//será modificado
	}
	
	public Devolucao Consultar() {
		Devolucao devolucao = null;
		return devolucao;
		//será modificado
	}
	
	public void Remover() {
		//será modificado
	}
	
}
