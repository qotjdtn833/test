package june3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//����� �϶�
public class n1 extends JFrame {
	JLabel j1 = new JLabel("�ڹٴ�");
	n1(){
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		 // �� ����
		
		j1.addMouseListener(new Mouse());
				
		 c.add(j1);
		 setVisible(true);
	}
	class Mouse extends MouseAdapter{
		public void mouseEntered(MouseEvent e) {
			j1.setText("��վ�");  //���콺 �÷�����
		}
		public void mouseExited(MouseEvent e) {
			j1.setText("�ڹٴ�");  //���콺 �ٽ� ��������
		}
	}
	public static void main(String[] args) {
		new n1();

	}

}
