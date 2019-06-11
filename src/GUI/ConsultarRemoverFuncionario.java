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
import java.awt.Font;
import javax.swing.JTextField;

public class ConsultarRemoverFuncionario extends JFrame {

	private JPanel contentPane;
	private static ConsultarRemoverFuncionario instance;
	private JTextField textFieldCpfDoFuncionario;
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

	public static ConsultarRemoverFuncionario getInstance() {
		if(instance == null) {
			instance = new ConsultarRemoverFuncionario();
		}
		return instance;
	}
	
	/**
	 * Create the frame.
	 */
	private ConsultarRemoverFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Biblioteca.getInstance().setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 228, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(335, 227, 89, 23);
		contentPane.add(btnRemover);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 92, 31, 14);
		contentPane.add(lblNome);
		
		JLabel lblNomedofuncionario = new JLabel("NomeDoFuncionario");
		lblNomedofuncionario.setBounds(51, 92, 95, 14);
		contentPane.add(lblNomedofuncionario);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(10, 117, 21, 14);
		contentPane.add(lblCpf);
		
		JLabel lblCpfdofuncionario = new JLabel("CpfDoFuncionario");
		lblCpfdofuncionario.setBounds(41, 117, 89, 14);
		contentPane.add(lblCpfdofuncionario);
		
		JLabel lblDigiteOCpf = new JLabel("Digite o cpf do funcion\u00E1rio:");
		lblDigiteOCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDigiteOCpf.setBounds(10, 11, 190, 14);
		contentPane.add(lblDigiteOCpf);
		
		textFieldCpfDoFuncionario = new JTextField();
		textFieldCpfDoFuncionario.setBounds(10, 36, 190, 20);
		contentPane.add(textFieldCpfDoFuncionario);
		textFieldCpfDoFuncionario.setColumns(10);
		
		JLabel lblDadosDoFuncionario = new JLabel("Dados do funcionario:");
		lblDadosDoFuncionario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDadosDoFuncionario.setBounds(10, 67, 137, 14);
		contentPane.add(lblDadosDoFuncionario);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(210, 35, 89, 23);
		contentPane.add(btnConsultar);
	}

}
