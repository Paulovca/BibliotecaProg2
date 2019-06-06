package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastroFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldCpf;
	private JTextField textFieldSenha;
	private static CadastroFuncionario instance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionario frame = new CadastroFuncionario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static CadastroFuncionario getInstance() {
		if(instance == null) {
			instance = new CadastroFuncionario();
		}
		return instance;
	}

	/**
	 * Create the frame.
	 */
	private CadastroFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(148, 107, 46, 14);
		contentPane.add(lblNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(185, 104, 86, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(148, 132, 46, 14);
		contentPane.add(lblCpf);
		
		textFieldCpf = new JTextField();
		textFieldCpf.setBounds(185, 129, 86, 20);
		contentPane.add(textFieldCpf);
		textFieldCpf.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(148, 157, 46, 14);
		contentPane.add(lblSenha);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(185, 154, 86, 20);
		contentPane.add(textFieldSenha);
		textFieldSenha.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(335, 228, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 228, 89, 23);
		contentPane.add(btnVoltar);
	}
}
