package june16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class n7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum=0,n;
		for(int i =0; i<5; i++) {
			System.out.println(i+1+"��° ���� :");
			
			try {
				int a =sc.nextInt();
				sum+=a;
			}
			
			catch(InputMismatchException e) {
				System.out.println("�ٽ� �Է��� �����ƴ��ݾ�");
				sc.nextLine();  //��ū����
				i--; // �ε������̱�
				continue;
			}
			
		}
		System.out.println("����"+ sum);
	}

}
