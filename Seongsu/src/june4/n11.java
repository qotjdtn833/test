package june4;

import java.util.Scanner;

public class n11 {
	// 실수 여러개 입력받고 평균출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = 0;
		int sum=0, i=0;
		while((n=sc.nextDouble())!=-1) {
			sum+=n;
			i++;
		
		}
		System.out.println(sum/i);
	}

}
