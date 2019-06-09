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

public class AtualizarLivro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private static AtualizarLivro instance;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtualizarLivro frame = new AtualizarLivro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static AtualizarLivro getInstance() {
		if(instance == null) {
			instance = new AtualizarLivro();
		}
		return instance;
	}
	
	/**
	 * Create the frame.
	 */
	private AtualizarLivro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLivrosCadastrados = new JLabel("Livros cadastrados:");
		lblLivrosCadastrados.setBounds(10, 11, 94, 14);
		contentPane.add(lblLivrosCadastrados);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 36, 200, 20);
		contentPane.add(comboBox);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setBounds(10, 67, 30, 14);
		contentPane.add(lblTtulo);
		
		JLabel lblTitulodolivro = new JLabel("TituloDoLivro");
		lblTitulodolivro.setBounds(50, 67, 62, 14);
		contentPane.add(lblTitulodolivro);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(10, 92, 31, 14);
		contentPane.add(lblAutor);
		
		JLabel lblAutordolivro = new JLabel("AutorDoLivro");
		lblAutordolivro.setBounds(50, 92, 63, 14);
		contentPane.add(lblAutordolivro);
		
		JLabel lblEstoque = new JLabel("Estoque:");
		lblEstoque.setBounds(10, 117, 43, 14);
		contentPane.add(lblEstoque);
		
		JLabel lblEstoquedelivros = new JLabel("EstoqueDeLivros");
		lblEstoquedelivros.setBounds(63, 117, 80, 14);
		contentPane.add(lblEstoquedelivros);
		
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
		
		JLabel lblTtulo_1 = new JLabel("T\u00EDtulo:");
		lblTtulo_1.setBounds(220, 67, 30, 14);
		contentPane.add(lblTtulo_1);
		
		textField = new JTextField();
		textField.setBounds(270, 64, 154, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAutor_1 = new JLabel("Autor:");
		lblAutor_1.setBounds(220, 92, 31, 14);
		contentPane.add(lblAutor_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(270, 89, 154, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEstoque_1 = new JLabel("Estoque:");
		lblEstoque_1.setBounds(220, 117, 43, 14);
		contentPane.add(lblEstoque_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(270, 114, 154, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}

}
