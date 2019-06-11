package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;

public class AtualizarFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private static AtualizarFuncionario instance;
	private JTextField textField_1;
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

	public static AtualizarFuncionario getInstance() {
		if(instance == null) {
			instance = new AtualizarFuncionario();
		}
		return instance;
	}
	
	/**
	 * Create the frame.
	 */
	private AtualizarFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 91, 31, 14);
		contentPane.add(lblNome);
		
		JLabel lblNomedofuncionario = new JLabel("NomeDoFuncionario");
		lblNomedofuncionario.setBounds(51, 91, 126, 14);
		contentPane.add(lblNomedofuncionario);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(10, 116, 21, 14);
		contentPane.add(lblCpf);
		
		JLabel lblCpfdofuncionario = new JLabel("CpfDoFuncionario");
		lblCpfdofuncionario.setBounds(41, 116, 85, 14);
		contentPane.add(lblCpfdofuncionario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 141, 34, 14);
		contentPane.add(lblSenha);
		
		JLabel lblSenhadofuncionario = new JLabel("SenhaDoFuncionario");
		lblSenhadofuncionario.setBounds(51, 141, 98, 14);
		contentPane.add(lblSenhadofuncionario);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Biblioteca.getInstance().setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 228, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(335, 227, 89, 23);
		contentPane.add(btnAtualizar);
		
		JLabel lblNome_1 = new JLabel("Nome:");
		lblNome_1.setBounds(220, 91, 31, 14);
		contentPane.add(lblNome_1);
		
		textField = new JTextField();
		textField.setBounds(261, 88, 163, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha_1 = new JLabel("Senha:");
		lblSenha_1.setBounds(220, 116, 34, 14);
		contentPane.add(lblSenha_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(261, 113, 163, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDigiteOCpf = new JLabel("Digite o cpf do funcion\u00E1rio:");
		lblDigiteOCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDigiteOCpf.setBounds(10, 11, 185, 14);
		contentPane.add(lblDigiteOCpf);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 36, 201, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDadosAntigos = new JLabel("Dados antigos:");
		lblDadosAntigos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDadosAntigos.setBounds(10, 67, 116, 14);
		contentPane.add(lblDadosAntigos);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(220, 35, 89, 23);
		contentPane.add(btnConsultar);
		
		JLabel lblDadosAtualizados = new JLabel("Dados atualizados:");
		lblDadosAtualizados.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDadosAtualizados.setBounds(220, 67, 139, 14);
		contentPane.add(lblDadosAtualizados);
	}

}