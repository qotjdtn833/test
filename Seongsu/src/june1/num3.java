package june1;

import java.awt.Container;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JButton;
class My implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		//원천을 알아내다
		
		if(b.getText().equals("java")) {
			//버튼의 문자열 받기
			b.setText("자바");
		}
		else {
			b.setText("java");
		}
	}
}

public class num3 extends JFrame {
	num3(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton j = new JButton("java");
		c.add(j);
		
		j.addActionListener(new My());
		
		
	}

	public static void main(String[] args) {
		new num1();

	}

}
