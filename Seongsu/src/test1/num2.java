package test1;

import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		double price = 100000;
		Scanner sc = new Scanner(System.in);
		System.out.println("�ð��� �Է� :");
		int time = sc.nextInt();
		System.out.println("���� ������ �Է� : ");
		int count = sc.nextInt();
		
		if(time==14) {
			if(count<=3) {
				System.out.printf("5�ۼ�Ʈ �����Ͽ� %.2f��\n", price*0.95);
			}
			else {System.out.printf("���� ���� %.2f��\n",price );
		}
	}

		else if(time==18) {
			if(count<=5) {
				System.out.printf("10�ۼ�Ʈ �����Ͽ� %.2f��\n", price*0.90);
			}
			else {System.out.printf("���� ���� %.2f��\n",price );
		}
		}
		else if(time==20) {
			if(count<=10) {
				System.out.printf("20�ۼ�Ʈ �����Ͽ� %.2f��\n", price*0.80);
			}
			else {System.out.printf("���� ���� %.2f��\n",price );
		
}
}
	}
}