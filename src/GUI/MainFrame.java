/*
 * Created on 05/05/2006
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package GUI;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * @author bruno
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class MainFrame extends JFrame
{
	MainFrame(String title)
	{
		super(title);
	}
	public static void main(String[] args) {
		MainFrame m = new MainFrame("GUJ Swing");
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComboBox box = new JComboBox();
		JPanel container = new JPanel();
		box.addItem("--Escolha um Item--");
		box.addItem("Item 1");
		box.addItem("Sair");
		container.add(box);
		m.getContentPane().add(container);
		m.pack();
		m.setLocationRelativeTo(null);
		m.setVisible(true);
	}
}