package days2;

import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int cnt=0, n=0;
		int sum = 0;
		System.out.println("정수 입력하고 마지막에 0입력");
		
		while((n=sc.nextInt())!=0) {
			sum+=n;
			cnt++;
		}
	System.out.println("평균 : " + (double)sum/cnt);
	}
	

}
