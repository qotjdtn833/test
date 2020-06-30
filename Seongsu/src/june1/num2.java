package june1;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;


public class num2 extends JFrame {
	num2(){
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		
		for(int i=0; i<10; i++) {
			String t = Integer.toString(i);
			JButton j = new JButton(t);
			c.add(j);
			// 정수 > Integer 객체로 > 객체를 문자열로 변경
			//t에 저장
		}
		setVisible(true); // 출력
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num2();
	}

}
