package june3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//어댑터 일때
public class n1 extends JFrame {
	JLabel j1 = new JLabel("자바는");
	n1(){
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		 // 라벨 생성
		
		j1.addMouseListener(new Mouse());
				
		 c.add(j1);
		 setVisible(true);
	}
	class Mouse extends MouseAdapter{
		public void mouseEntered(MouseEvent e) {
			j1.setText("재밌어");  //마우스 올렸을때
		}
		public void mouseExited(MouseEvent e) {
			j1.setText("자바는");  //마우스 다시 내렸을때
		}
	}
	public static void main(String[] args) {
		new n1();

	}

}
