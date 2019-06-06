package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;

public class CadastroDevolucao2 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAluno;
	private JTextField textFieldItens;
	private static CadastroDevolucao2 instance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDevolucao2 frame = new CadastroDevolucao2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static CadastroDevolucao2 getInstance() {
		if(instance == null) {
			instance = new CadastroDevolucao2();
		}
		return instance;
	}

	/**
	 * Create the frame.
	 */
	private CadastroDevolucao2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(51, 204, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAluno = new JLabel("Aluno:");
		lblAluno.setBounds(123, 90, 46, 14);
		contentPane.add(lblAluno);
		
		textFieldAluno = new JTextField();
		textFieldAluno.setBounds(164, 87, 100, 26);
		contentPane.add(textFieldAluno);
		textFieldAluno.setColumns(10);
		
		JLabel lblItens = new JLabel("Itens:");
		lblItens.setBounds(123, 118, 46, 14);
		contentPane.add(lblItens);
		
		textFieldItens = new JTextField();
		textFieldItens.setBounds(164, 115, 100, 26);
		contentPane.add(textFieldItens);
		textFieldItens.setColumns(10);
		
		JLabel lblMulta = new JLabel("Multa:");
		lblMulta.setBounds(123, 143, 46, 14);
		contentPane.add(lblMulta);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 228, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnDevolver = new JButton("Devolver");
		btnDevolver.setBounds(335, 228, 89, 23);
		contentPane.add(btnDevolver);
		
		JLabel lblMultaValor = new JLabel();
		lblMultaValor.setBackground(new Color(255, 255, 255));
		lblMultaValor.setForeground(new Color(0, 0, 0));
		lblMultaValor.setBounds(164, 143, 100, 26);
		contentPane.add(lblMultaValor);
		
	}
}
