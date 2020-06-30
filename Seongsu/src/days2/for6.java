package days2;

import java.util.Scanner;

public class for6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력 :");
		int a = sc.nextInt();
		
		for(int i=1; i<6; i++) {
			System.out.printf("%d\n", i*a);
		}

	}

}
