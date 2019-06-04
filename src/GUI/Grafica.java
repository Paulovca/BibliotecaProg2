package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import negocio.Fachada;
import negocio.exception.funcionario.FuncionarioNaoEncontradoException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Grafica extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCpf;
	private JTextField textFieldSenha;
	private static Grafica instance;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafica frame = new Grafica();
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
	public static Grafica getInstance() {
		if(instance == null) {
			instance = new Grafica();
		}
		return instance;
	}
	
	public Grafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(126, 146, 46, 14);
		contentPane.add(lblCpf);
		
		textFieldCpf = new JTextField();
		textFieldCpf.setBounds(170, 143, 100, 20);
		contentPane.add(textFieldCpf);
		textFieldCpf.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Senha:");
		lblNewLabel.setBounds(126, 180, 46, 14);
		contentPane.add(lblNewLabel);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(170, 177, 100, 20);
		contentPane.add(textFieldSenha);
		textFieldSenha.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
						Fachada.getInstance().consultarFuncionario(textFieldCpf.getText());
						dispose();
						Biblioteca.getInstance().setVisible(true);
					} catch (FuncionarioNaoEncontradoException e1) {
						e1.getMessage();
					}
				}
			
		});
		btnEntrar.setBounds(311, 211, 89, 23);
		contentPane.add(btnEntrar);
		
		
		
	}
}
