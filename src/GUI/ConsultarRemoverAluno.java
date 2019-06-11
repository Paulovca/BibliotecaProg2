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

public class ConsultarRemoverAluno extends JFrame {

	private JPanel contentPane;
	private static ConsultarRemoverAluno instance;
	private JTextField textFieldCpfDoAluno;

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
		if (instance == null) {
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

		JLabel lblCpfDoAluno = new JLabel("Digite o cpf do aluno:");
		lblCpfDoAluno.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCpfDoAluno.setBounds(10, 11, 156, 14);
		contentPane.add(lblCpfDoAluno);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				instance = null;
				Biblioteca.getInstance().setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 228, 89, 23);
		contentPane.add(btnVoltar);
		if (Biblioteca.flag == false) {
			JButton btnRemover = new JButton("Remover");
			btnRemover.setBounds(335, 227, 89, 23);
			contentPane.add(btnRemover);
		}
		if(Biblioteca.flag == true) {
			JButton btnConsultar = new JButton("Consultar");
			btnConsultar.setBounds(335, 227, 89, 23);
			contentPane.add(btnConsultar);
		}

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 92, 31, 14);
		contentPane.add(lblNome);

		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(10, 117, 21, 14);
		contentPane.add(lblCpf);

		JLabel lblNomedoaluno = new JLabel("NomeDoAluno");
		lblNomedoaluno.setBounds(51, 92, 67, 14);
		contentPane.add(lblNomedoaluno);

		JLabel lblCpfdoaluno = new JLabel("CpfDoAluno");
		lblCpfdoaluno.setBounds(41, 117, 57, 14);
		contentPane.add(lblCpfdoaluno);
		
		textFieldCpfDoAluno = new JTextField();
		textFieldCpfDoAluno.setBounds(10, 36, 200, 20);
		contentPane.add(textFieldCpfDoAluno);
		textFieldCpfDoAluno.setColumns(10);
		
		JLabel lblDadosDoAluno = new JLabel("Dados do Aluno:");
		lblDadosDoAluno.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDadosDoAluno.setBounds(10, 67, 108, 14);
		contentPane.add(lblDadosDoAluno);
	}
}
