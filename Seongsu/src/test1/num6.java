package test1;

import java.util.Scanner;

public class num6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		do {
			System.out.println("문자열을 입력 : ");
			String a = sc.next();
			if(a.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			i++;
			
		}
		while(true);

	}

}
