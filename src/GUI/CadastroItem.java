package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastroItem extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldQuantidade;
	private static CadastroItem instance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroItem frame = new CadastroItem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static CadastroItem getInstance() {
		if(instance == null) {
			instance = new CadastroItem();
		}
		return instance;
	}

	/**
	 * Create the frame.
	 */
	private CadastroItem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLivro = new JLabel("Livro:");
		lblLivro.setBounds(127, 102, 46, 14);
		contentPane.add(lblLivro);
		
		JComboBox comboBoxLivros = new JComboBox();
		comboBoxLivros.setBounds(162, 99, 121, 20);
		contentPane.add(comboBoxLivros);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(127, 140, 72, 14);
		contentPane.add(lblQuantidade);
		
		textFieldQuantidade = new JTextField();
		textFieldQuantidade.setBounds(197, 137, 86, 20);
		contentPane.add(textFieldQuantidade);
		textFieldQuantidade.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 228, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(335, 228, 89, 23);
		contentPane.add(btnCadastrar);
		
	}
}
