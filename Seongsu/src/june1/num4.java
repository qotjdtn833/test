package june1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class num4 extends JFrame {
	num4(){
		Container c = getContentPane();
		JButton j1 = new JButton("orange");
		JButton j2 = new JButton("yellow");
		c.add(j1); c.add(j2);
		c.setLayout(new FlowLayout());
		// object 클래스 : 최고조상클래스
		//모든 클래스들이 object 클래스를 상속받고 있다.
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setBackground(Color.orange);
			}
		});
		j2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j2.setEnabled(false);
			}
		});
			
	
		
		
		
		//flow
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num4();
	}

}
