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

public class AtualizarAluno extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private static AtualizarAluno instance;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtualizarAluno frame = new AtualizarAluno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static AtualizarAluno getInstance() {
		if(instance == null) {
			instance = new AtualizarAluno();
		}
		return instance;
	}

	/**
	 * Create the frame.
	 */
	private AtualizarAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 92, 31, 14);
		contentPane.add(lblNome);
		
		JLabel lblNomedoaluno = new JLabel("NomeDoAluno");
		lblNomedoaluno.setBounds(51, 92, 67, 14);
		contentPane.add(lblNomedoaluno);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(10, 117, 21, 14);
		contentPane.add(lblCpf);
		
		JLabel lblCpfdoaluno = new JLabel("CpfDoAluno");
		lblCpfdoaluno.setBounds(41, 117, 57, 14);
		contentPane.add(lblCpfdoaluno);
		
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
		lblNome_1.setBounds(220, 92, 31, 14);
		contentPane.add(lblNome_1);
		
		textField = new JTextField();
		textField.setBounds(261, 89, 163, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDigiteOCpf = new JLabel("Digite o cpf do aluno:");
		lblDigiteOCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDigiteOCpf.setBounds(10, 11, 168, 14);
		contentPane.add(lblDigiteOCpf);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 36, 200, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(220, 35, 89, 23);
		contentPane.add(btnConsultar);
		
		JLabel lblDadosAntigos = new JLabel("Dados antigos:");
		lblDadosAntigos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDadosAntigos.setBounds(10, 67, 113, 14);
		contentPane.add(lblDadosAntigos);
		
		JLabel lblDadosAtualizados = new JLabel("Dados atualizados:");
		lblDadosAtualizados.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDadosAtualizados.setBounds(220, 69, 134, 14);
		contentPane.add(lblDadosAtualizados);
	}
}
