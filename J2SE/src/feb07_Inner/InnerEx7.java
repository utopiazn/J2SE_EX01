package feb07_Inner;

import java.awt.*;
import java.awt.event.*;


public class InnerEx7 {
	
	public static void main(String[] args){
		
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());
		
	}

}
class EventHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ActionEvent occurred!!");
	}
	
}
