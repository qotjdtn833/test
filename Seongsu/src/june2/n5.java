package june2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class n5 extends JFrame{
	n5(){
		super("타이틀1");
		JButton j1 = new JButton("확인");
		this.add(j1);
		j1.setBackground(Color.red);
		this.setLayout(new FlowLayout);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n5();
	}

}
