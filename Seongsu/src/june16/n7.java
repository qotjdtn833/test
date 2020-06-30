package june16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class n7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum=0,n;
		for(int i =0; i<5; i++) {
			System.out.println(i+1+"번째 정수 :");
			
			try {
				int a =sc.nextInt();
				sum+=a;
			}
			
			catch(InputMismatchException e) {
				System.out.println("다시 입력해 정수아니잖아");
				sc.nextLine();  //토큰제거
				i--; // 인덱스줄이기
				continue;
			}
			
		}
		System.out.println("총합"+ sum);
	}

}
