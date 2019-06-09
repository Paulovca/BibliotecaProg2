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

public class ConsultarRemoverLivro extends JFrame {

	private JPanel contentPane;
	private static ConsultarRemoverLivro instance;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarRemoverLivro frame = new ConsultarRemoverLivro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static ConsultarRemoverLivro getInstance() {
		if(instance == null) {
			instance = new ConsultarRemoverLivro();
		}
		return instance;
	}
	
	/**
	 * Create the frame.
	 */
	private ConsultarRemoverLivro() {
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
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setBounds(220, 39, 30, 14);
		contentPane.add(lblTtulo);
		
		JLabel lblTtulodolivro = new JLabel("T\u00EDtuloDoLivro");
		lblTtulodolivro.setBounds(260, 39, 62, 14);
		contentPane.add(lblTtulodolivro);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(220, 64, 31, 14);
		contentPane.add(lblAutor);
		
		JLabel lblAutordolivro = new JLabel("AutorDoLivro");
		lblAutordolivro.setBounds(260, 64, 63, 14);
		contentPane.add(lblAutordolivro);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(220, 89, 63, 14);
		contentPane.add(lblQuantidade);
		
		JLabel lblQuantidadedelivros = new JLabel("QuantidadeDeLivros");
		lblQuantidadedelivros.setBounds(293, 89, 97, 14);
		contentPane.add(lblQuantidadedelivros);
	}

}
