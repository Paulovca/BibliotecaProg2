package teste;

import negocio.Aluno;
import negocio.Emprestimo;
import negocio.Funcionario;
import negocio.Item;
import negocio.Livro;

public class classeTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("02408324262", "André");
		Livro livro1 = new Livro("O código davinci", "Paulo Vinícius", 3);
		Funcionario fun1 = new Funcionario("11111111111", "Diego");
		Item item1 = new Item(livro1, 1);
		//deve-se criar um array de itens para passar em empréstimo, porém onde esse array será criado?
		//deve-se criar uma data de emprestimo e devolucao para passar em empréstimo, porém onde esse objeto data será criada?
		Emprestimo emp1 = new Emprestimo(aluno1, null, fun1, null, null);
		//
	}
	
}
