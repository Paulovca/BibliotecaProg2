package teste;

import negocio.entidades.Aluno;
import negocio.entidades.Emprestimo;
import negocio.entidades.Funcionario;
import negocio.entidades.Item;
import negocio.entidades.Livro;

public class classeTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("02408324262", "Andr�");
		Livro livro1 = new Livro("O c�digo davinci", "Paulo Vin�cius", 3);
		Funcionario fun1 = new Funcionario("11111111111", "Diego");
		Item item1 = new Item(livro1, 1);
		//deve-se criar um array de itens para passar em empr�stimo, por�m onde esse array ser� criado?
		//deve-se criar uma data de emprestimo e devolucao para passar em empr�stimo, por�m onde esse objeto data ser� criada?
		Emprestimo emp1 = new Emprestimo(aluno1, null, fun1, null, null);
		//
	}
	
}
