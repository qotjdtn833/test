package test1;

import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a ������ �Է� : ");
		double a = sc.nextDouble();
		System.out.println("b ������ �Է� : ");
		double b = sc.nextDouble();
 
		
		System.out.printf("a�� b�� ��հ��� %.1f", (a+b)/2);
	}

}
