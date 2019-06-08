package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;

public class AtualizarFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtualizarFuncionario frame = new AtualizarFuncionario();
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
	public AtualizarFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFuncionariosCadastrados = new JLabel("Funcionarios cadastrados:");
		lblFuncionariosCadastrados.setBounds(10, 11, 126, 14);
		contentPane.add(lblFuncionariosCadastrados);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 36, 200, 20);
		contentPane.add(comboBox);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 67, 31, 14);
		contentPane.add(lblNome);
		
		JLabel lblNomedofuncionario = new JLabel("NomeDoFuncionario");
		lblNomedofuncionario.setBounds(51, 67, 126, 14);
		contentPane.add(lblNomedofuncionario);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(10, 92, 21, 14);
		contentPane.add(lblCpf);
		
		JLabel lblCpfdofuncionario = new JLabel("CpfDoFuncionario");
		lblCpfdofuncionario.setBounds(41, 92, 85, 14);
		contentPane.add(lblCpfdofuncionario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 117, 34, 14);
		contentPane.add(lblSenha);
		
		JLabel lblSenhadofuncionario = new JLabel("SenhaDoFuncionario");
		lblSenhadofuncionario.setBounds(51, 117, 98, 14);
		contentPane.add(lblSenhadofuncionario);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 227, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(335, 227, 89, 23);
		contentPane.add(btnAtualizar);
		
		JLabel lblNome_1 = new JLabel("Nome:");
		lblNome_1.setBounds(220, 67, 31, 14);
		contentPane.add(lblNome_1);
		
		textField = new JTextField();
		textField.setBounds(261, 64, 163, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCpf_1 = new JLabel("Cpf:");
		lblCpf_1.setBounds(220, 92, 21, 14);
		contentPane.add(lblCpf_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(261, 89, 163, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSenha_1 = new JLabel("Senha:");
		lblSenha_1.setBounds(220, 117, 34, 14);
		contentPane.add(lblSenha_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(261, 114, 163, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}

}
