package GUI;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;

public class CadastrarEmprestimo extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCpfDoAluno;
	private JButton btnVoltar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarEmprestimo frame = new CadastrarEmprestimo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastrarEmprestimo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCpfDoAluno = new JLabel("Cpf do Aluno:");
		lblCpfDoAluno.setBounds(117, 105, 86, 14);
		contentPane.add(lblCpfDoAluno);
		
		textFieldCpfDoAluno = new JTextField();
		textFieldCpfDoAluno.setBounds(190, 102, 86, 20);
		contentPane.add(textFieldCpfDoAluno);
		textFieldCpfDoAluno.setColumns(10);
		
		JLabel lblItens = new JLabel("Itens:");
		lblItens.setBounds(117, 130, 46, 14);
		contentPane.add(lblItens);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(162, 130, 89, 23);
		contentPane.add(btnAdicionar);
		
		JList list = new JList();
		list.setBounds(162, 155, 114, 36);
		contentPane.add(list);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 228, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(335, 228, 89, 23);
		contentPane.add(btnCadastrar);
	}
}
