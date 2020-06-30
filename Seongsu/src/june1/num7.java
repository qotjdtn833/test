package june1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Me implements ActionListener{
	JTextField id;
	JPasswordField pw;
	Me(JTextField id,JPasswordField pw){
		this.id=id;
		this.pw=pw;
		
		
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println(id.getText());
		System.out.println(pw.getPassword());
		id.setText(""); // 공백으로 초기화
		pw.setText("");
	}
	
}

public class num7 {

	public static void main(String[] args) {
		JFrame f = new JFrame("jframe");
		f.setLayout(new GridLayout(2,2));
		
		JLabel j1 = new JLabel("ID",SwingConstants.RIGHT);
		JTextField id = new JTextField(10);
		//아디 입력창
		JLabel j2 = new JLabel("PW",SwingConstants.RIGHT);
		JPasswordField pw = new JPasswordField(10);
		pw.setEchoChar('*');
		
		pw.addActionListener(new Me(id,pw));
		
		f.add(j1);
		f.add(id);
		f.add(j2);
		f.add(pw);
		f.setVisible(true);

	}

}
