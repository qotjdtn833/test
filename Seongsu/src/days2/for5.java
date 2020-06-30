package days2;

import java.util.Scanner;

public class for5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("정수를 입력 :");
		int a = sc.nextInt();
		int i = 3, j =4;
		
		
		
		switch(a) {
		
		case 1 :
		System.out.printf("%d + %d = %d",i,j,i+j);
		break;
		
		case 2:
			System.out.printf("%d - %d = %d",i,j,i-j);
			break;
			
		case 3:
			System.out.printf("%d * %d = %d",i,j,i*j);
			break;
			
		case 4:
			System.out.printf("%d / %d = %d",i,j,i/j);
			break;
		}
		
		

	}

}
