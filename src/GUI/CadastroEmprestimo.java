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
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroEmprestimo extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCpfDoAluno;
	private JButton btnVoltar;
	private static CadastroEmprestimo instance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroEmprestimo frame = new CadastroEmprestimo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static CadastroEmprestimo getInstance() {
		if(instance == null) {
			instance = new CadastroEmprestimo();
		}
		return instance;
	}

	/**
	 * Create the frame.
	 */
	private CadastroEmprestimo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCpfDoAluno = new JLabel("Cpf do Aluno:");
		lblCpfDoAluno.setBounds(104, 49, 66, 14);
		contentPane.add(lblCpfDoAluno);
		
		textFieldCpfDoAluno = new JTextField();
		textFieldCpfDoAluno.setBounds(180, 46, 148, 20);
		contentPane.add(textFieldCpfDoAluno);
		textFieldCpfDoAluno.setColumns(10);
		
		JLabel lblItens = new JLabel("Itens:");
		lblItens.setBounds(104, 80, 29, 14);
		contentPane.add(lblItens);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(239, 76, 89, 23);
		contentPane.add(btnAdicionar);
		
		JList list = new JList();
		list.setBounds(104, 105, 224, 114);
		contentPane.add(list);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Biblioteca.getInstance().setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 228, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(335, 228, 89, 23);
		contentPane.add(btnCadastrar);
		
		JLabel lblDigiteOCpf = new JLabel("Digite o Cpf do aluno e adicione itens para cadastrar o empr\u00E9stimo:");
		lblDigiteOCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDigiteOCpf.setBounds(10, 11, 399, 14);
		contentPane.add(lblDigiteOCpf);
	}
}
