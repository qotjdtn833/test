package test1;

import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		double price = 100000;
		Scanner sc = new Scanner(System.in);
		System.out.println("시간을 입력 :");
		int time = sc.nextInt();
		System.out.println("물건 개수를 입력 : ");
		int count = sc.nextInt();
		
		if(time==14) {
			if(count<=3) {
				System.out.printf("5퍼센트 할인하여 %.2f원\n", price*0.95);
			}
			else {System.out.printf("할인 없이 %.2f원\n",price );
		}
	}

		else if(time==18) {
			if(count<=5) {
				System.out.printf("10퍼센트 할인하여 %.2f원\n", price*0.90);
			}
			else {System.out.printf("할인 없이 %.2f원\n",price );
		}
		}
		else if(time==20) {
			if(count<=10) {
				System.out.printf("20퍼센트 할인하여 %.2f원\n", price*0.80);
			}
			else {System.out.printf("할인 없이 %.2f원\n",price );
		
}
}
	}
}