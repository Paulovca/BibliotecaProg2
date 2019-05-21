package teste;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import negocio.entidades.Aluno;
import negocio.entidades.Funcionario;
import negocio.entidades.Item;
import negocio.entidades.Livro;

public class classeTeste {
	
	private static final DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("02408324262", "André");
		Livro livro1 = new Livro("O código davinci", "Paulo Vinícius", 3);
		Funcionario fun1 = new Funcionario("Pedrinho","asqueroso123", "comiquemtalendo");
		Item item1 = new Item(livro1, 1);
		//deve-se criar um array de itens para passar em empréstimo, porém onde esse array será criado?
		//deve-se criar uma data de emprestimo e devolucao para passar em empréstimo, porém onde esse objeto data será criada?
		
		Calendar cal = Calendar.getInstance();
	    System.out.println(sdf.format(cal.getTime()));
	    
	    LocalDateTime now = LocalDateTime.now();
	    System.out.println(dtf.format(now));
	    
	    System.out.println();
	    
	    
		
		
		
		//Emprestimo emp1 = new Emprestimo(aluno1, null, fun1, null, null);
		//
	}
	
}
