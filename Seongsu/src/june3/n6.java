package june3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//�޴���
public class n6 extends JFrame {
	n6(){
		Container c = getContentPane();
		setTitle("�޴� �����");
		c.setLayout(new FlowLayout());
		JMenuBar j = new JMenuBar();
		JMenu j1 = new JMenu("Search");
		JMenu j2 = new JMenu("Project");
		
		JMenuItem j3 = new JMenuItem("open");
		JMenuItem j4 = new JMenuItem("close");
		
		setJMenuBar(j);
		//�޴��ٸ� ����Ʈ�ҿ� ����
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
