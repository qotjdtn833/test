package days2;

import java.util.Scanner;

public class while5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("하나의 정수를 입력 : ");
		int a = (int)(Math.random()*100)+1;
		System.out.println(a);
		
		while(true) {
			if(a<50) {
				System.out.println("50미만");
				break;
			}
			else {
				System.out.println("탈출");
				break;
				
				
				
			}
			
		}
		

	}

}
