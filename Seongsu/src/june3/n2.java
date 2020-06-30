package june3;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class n2 extends JFrame{
	n2(){
		super("Java Study");
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		JButton j1 = new JButton("확인");
		JButton j2 = new JButton("취소");
		j1.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {
				System.out.println("OK");
			}
		});
		j2.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {
				j2.setEnabled(false);
			}
		});
		c.add(j1);
		c.add(j2);
		setVisible(true);
		
	}

	public static void main(String[] args) {
	
		new n2();
		
	}

}
