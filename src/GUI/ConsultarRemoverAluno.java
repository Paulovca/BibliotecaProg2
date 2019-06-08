package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ConsultarRemoverAluno extends JFrame {

	private JPanel contentPane;
	private static ConsultarRemoverAluno instance;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarRemoverAluno frame = new ConsultarRemoverAluno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static ConsultarRemoverAluno getInstance() {
		if(instance == null) {
			instance = new ConsultarRemoverAluno();
		}
		return instance;
	}
	
	/**
	 * Create the frame.
	 */
	private ConsultarRemoverAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAlunosCadastrados = new JLabel("Alunos cadastrados:");
		lblAlunosCadastrados.setBounds(10, 11, 101, 14);
		contentPane.add(lblAlunosCadastrados);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 36, 200, 20);
		contentPane.add(comboBox);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 227, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(335, 227, 89, 23);
		contentPane.add(btnRemover);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(220, 39, 31, 14);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(220, 64, 21, 14);
		contentPane.add(lblCpf);
		
		JLabel lblNomedoaluno = new JLabel("NomeDoAluno");
		lblNomedoaluno.setBounds(261, 39, 67, 14);
		contentPane.add(lblNomedoaluno);
		
		JLabel lblCpfdoaluno = new JLabel("CpfDoAluno");
		lblCpfdoaluno.setBounds(251, 64, 57, 14);
		contentPane.add(lblCpfdoaluno);
	}
}
