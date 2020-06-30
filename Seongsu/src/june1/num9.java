package june1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class num9 extends JFrame {
	num9(){
		Container c = getContentPane();
		JButton j1 = new JButton("orange");
		JButton j2 = new JButton("yellow");
		JButton j3 = new JButton("white");
		
		c.add(j1); c.add(j2); c.add(j3);
		c.setLayout(new FlowLayout());
		
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("orange");
			}
		});
		
		j2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j2.setEnabled(false);
			}
		});
		
		j3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j3.setBackground(Color.orange);
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new num9();

	}

}
