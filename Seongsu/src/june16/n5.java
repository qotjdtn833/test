package june16;

import java.awt.*;

import javax.swing.*;



public class n5 extends JFrame {
	n5(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j = new JLabel("���!");
		ImageIcon im = new ImageIcon("C:\\Users\\soldesk\\Desktop\\pizza.jpg");
		JLabel j1 = new JLabel(im, SwingConstants.CENTER);
		
		c.add(j);
		
		c.add(j1);
		setVisible(true);
		
		//jlabel �Ű������� �̹��� �������� ��ü�� ���� �̹����� �����ӿ� ���
		
	}
	public static void main(String[] args) {
		new n5();
	}

}
