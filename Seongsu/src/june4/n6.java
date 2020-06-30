package june4;

import java.util.Scanner;
//try 문
public class n6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력 : ");
		while(true) {
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a*b);
			break;
		}
		catch(Exception e) {
			System.out.println("실수는 안된다.");
			sc.next();//토큰지우기
			
			continue;
		}
		}
	}

}
