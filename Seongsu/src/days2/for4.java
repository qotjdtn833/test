package days2;

import java.util.Scanner;

public class for4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¸î ´Ü?");
		int n = sc.nextInt();
		
		for(int i =1; i <=9; i++) {
			System.out.printf("%d * %d = %d\n", n,i,n*i);
		}

	}

}
