package test1;

import java.util.Scanner;

public class num6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		do {
			System.out.println("���ڿ��� �Է� : ");
			String a = sc.next();
			if(a.equals("exit")) {
				System.out.println("���α׷� ����");
				break;
			}
			i++;
			
		}
		while(true);

	}

}
