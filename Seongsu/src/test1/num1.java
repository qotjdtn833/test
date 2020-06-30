package test1;

import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a 점수를 입력 : ");
		double a = sc.nextDouble();
		System.out.println("b 점수를 입력 : ");
		double b = sc.nextDouble();
 
		
		System.out.printf("a와 b의 평균값은 %.1f", (a+b)/2);
	}

}
