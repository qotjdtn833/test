package june16;

import java.util.Scanner;
import java.util.Vector;
class MovieTread{
	
}

public class n6vec {

	public static void main(String[] args) {
	int n;
	Scanner sc =new Scanner(System.in);
	System.out.println("1~100���� �ȿ��� ������ �Է� :");
	n=sc.nextInt();
	
	int a=n/10;
	int b=n%10;
	
	switch(a) {
	case 3:
	case 6:
	case 9:
		if(b==3 || b==6 || b==9) {
			//a,b ���߿� �ϳ�
			System.out.println("¦¦");
			break;
		}
		else {//a�� 3,6,9 �� �� �ϳ����� b�� �ƴҰ��
			System.out.println("¦");
			break;
		}
	
		default: //a�� 369 ���� �ƴ� ��
			if(b==3 || b==6 || b==9) {
				System.out.println("¦");
				break;
			}
			else {
				System.out.println("��");
				break;
			}
	}

}
}
