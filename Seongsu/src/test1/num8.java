package test1;

import java.util.Scanner;

public class num8 {
	
	static int plus(int a, int b) {
		
		return a*b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		int r;
		r=plus(x,y); // plus의 반환형이 int여서
		System.out.println(r);
	}
		
		
		

	

}
