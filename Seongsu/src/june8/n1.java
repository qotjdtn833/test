package june8;

import java.awt.Container;
import java.awt.*;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class n1 extends JFrame {
	n1(){
		Container c = getContentPane();
		c.setLayout(new GridLayout(2,3));
	
	
	Color co[] = {Color.red, Color.black, Color.orange, Color.cyan, Color.yellow, Color.green};
	
	for(int i=0; i < co.length; i++) {
		String n = Integer.toString(i);
		JButton j =new JButton(n);
		j.setBackground(co[i]);
		c.add(j);
	}
	setVisible(true);
	}
	public static void main(String[] args) {
		new n1();
		
		
	}

}
