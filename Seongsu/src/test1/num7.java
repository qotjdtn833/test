package test1;

import java.util.Scanner;

public class num7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a= 0;
		while(true) {
			a++;
			System.out.println("���� �Է� :");
			int number = sc.nextInt();
			if(number==18) {
				System.out.println("�����̴�");
				break;
			}
			else if(number<18) {
				System.out.printf("%d���� ũ��!!\n",number);
			}
			else {
				System.out.printf("%d���� �۴�!!\n",number);
			}
		}
		System.out.println("�õ��� Ƚ����"+ a + "��");
	}

}
