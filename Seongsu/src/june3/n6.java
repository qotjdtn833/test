package june3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//메뉴바
public class n6 extends JFrame {
	n6(){
		Container c = getContentPane();
		setTitle("메뉴 만들기");
		c.setLayout(new FlowLayout());
		JMenuBar j = new JMenuBar();
		JMenu j1 = new JMenu("Search");
		JMenu j2 = new JMenu("Project");
		
		JMenuItem j3 = new JMenuItem("open");
		JMenuItem j4 = new JMenuItem("close");
		
		setJMenuBar(j);
		//메뉴바를 컨텐트팬에 부착
		j.add(j1);
		j.add(j2);
		j2.add(j3);
		j2.add(j4);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new n6();
	}

}
