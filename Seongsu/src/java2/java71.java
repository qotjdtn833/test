package java2;

import javax.swing.JOptionPane;

public class java71 {

	public static void main(String[] args) {
		String srt1="";
		String srt2="";
		Double num1, num2;
		char ch = 'A';
		
		num1=Double.parseDouble(JOptionPane.showInputDialog("��1"));
		num2=Double.parseDouble(JOptionPane.showInputDialog("��2"));
		
		if(num2!=0) {
			System.out.println(num1/num2);
		}

		if(Character.isDigit(ch))
		{
			System.out.println(ch + "�� ���ڰ� �ƴմϴ�.");
		}
		else {
			System.out.println(ch + "�� �����Դϴ�.");
		}
	}

}
