package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;

public class CadastroDevolucao extends JFrame {

	private JPanel contentPane;
	private static CadastroDevolucao instance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDevolucao frame = new CadastroDevolucao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static CadastroDevolucao getInstance() {
		if(instance == null) {
			instance = new CadastroDevolucao();
		}
		return instance;
	}

	/**
	 * Create the frame.
	 */
	private CadastroDevolucao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaDeEmprstimos = new JLabel("Lista de Empr\u00E9stimos:");
		lblListaDeEmprstimos.setBounds(159, 11, 104, 14);
		contentPane.add(lblListaDeEmprstimos);
		
		JList list = new JList();
		list.setBounds(95, 36, 246, 186);
		contentPane.add(list);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 228, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(335, 228, 89, 23);
		contentPane.add(btnOk);
	}

}
