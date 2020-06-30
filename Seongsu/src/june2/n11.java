package june2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class n11 extends JFrame{
	n11(){
		Container c= getContentPane();
		JButton j1= new JButton("»ö±ò");
		j1.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {
				j1.setBackground(Color.RED);
			}
		});
		JButton j2= new JButton("=");
		j2.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {
				System.out.println("¹öÆ° 2");
			}
		});
		this.setLayout(new FlowLayout());
		this.add(j1);
		this.add(j2);
		setVisible(true);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new n11();
	}

}
