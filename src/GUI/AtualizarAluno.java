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

public class AtualizarAluno extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
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

	/**
	 * Create the frame.
	 */
	public AtualizarAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAlunosCadastrados = new JLabel("Alunos cadastrados:");
		lblAlunosCadastrados.setBounds(10, 11, 98, 14);
		contentPane.add(lblAlunosCadastrados);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 36, 200, 20);
		contentPane.add(comboBox);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 67, 31, 14);
		contentPane.add(lblNome);
		
		JLabel lblNomedoaluno = new JLabel("NomeDoAluno");
		lblNomedoaluno.setBounds(51, 67, 67, 14);
		contentPane.add(lblNomedoaluno);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(10, 92, 21, 14);
		contentPane.add(lblCpf);
		
		JLabel lblCpfdoaluno = new JLabel("CpfDoAluno");
		lblCpfdoaluno.setBounds(41, 92, 57, 14);
		contentPane.add(lblCpfdoaluno);
		
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
	}
}
