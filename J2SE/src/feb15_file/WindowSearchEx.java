package feb15_file;

import java.awt.*;
import javax.swing.*;
public class WindowSearchEx extends JFrame{
	private JScrollPane sp_jtree;
	public WindowSearchEx(){
		Container contentPane = getContentPane();
		sp_jtree = new JScrollPane(new JTreeDelegate(),
			ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
			ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp_jtree.setPreferredSize(new Dimension(300, 550));
		contentPane.add(sp_jtree);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(310,555);
		setVisible(true);
	}
	public static void main(String[] args){
		JFrame.setDefaultLookAndFeelDecorated(true);
		new WindowSearchEx();
	}
}