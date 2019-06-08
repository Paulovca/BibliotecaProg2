package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ConsultarRemoverFuncionario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarRemoverFuncionario frame = new ConsultarRemoverFuncionario();
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
	public ConsultarRemoverFuncionario() {
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
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 227, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(335, 227, 89, 23);
		contentPane.add(btnRemover);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(220, 39, 31, 14);
		contentPane.add(lblNome);
		
		JLabel lblNomedofuncionario = new JLabel("NomeDoFuncionario");
		lblNomedofuncionario.setBounds(261, 39, 95, 14);
		contentPane.add(lblNomedofuncionario);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(220, 64, 21, 14);
		contentPane.add(lblCpf);
		
		JLabel lblCpfdofuncionario = new JLabel("CpfDoFuncionario");
		lblCpfdofuncionario.setBounds(251, 64, 89, 14);
		contentPane.add(lblCpfdofuncionario);
	}

}
