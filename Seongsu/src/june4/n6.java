package june4;

import java.util.Scanner;
//try ��
public class n6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է� : ");
		while(true) {
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a*b);
			break;
		}
		catch(Exception e) {
			System.out.println("�Ǽ��� �ȵȴ�.");
			sc.next();//��ū�����
			
			continue;
		}
		}
	}

}
