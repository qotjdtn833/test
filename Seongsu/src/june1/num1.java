package june1;
import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

 

public class num1 extends JFrame {
	num1(){
		Container c = getContentPane();
		c.setBackground(Color.orange);
		c.setLayout(new FlowLayout());
		// JButton j = new JButton("OK");
		c.add(new JButton("Ok"));
		c.add(new JButton("Cancel"));
		c.add(new JButton("»Æ¿Œ"));
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new num1();

	}

}
