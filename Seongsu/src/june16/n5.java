package june16;

import java.awt.*;

import javax.swing.*;



public class n5 extends JFrame {
	n5(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j = new JLabel("경민!");
		ImageIcon im = new ImageIcon("C:\\Users\\soldesk\\Desktop\\pizza.jpg");
		JLabel j1 = new JLabel(im, SwingConstants.CENTER);
		
		c.add(j);
		
		c.add(j1);
		setVisible(true);
		
		//jlabel 매개변수로 이미지 아이콘의 객체가 들어가야 이미지가 프레임에 뜬다
		
	}
	public static void main(String[] args) {
		new n5();
	}

}
