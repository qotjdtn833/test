package days2;

import java.util.Scanner;

public class while6 {
    // 음수인 경우 더하지 말고 양수의 합만 출력
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum =0;
	for(int i=1; i<=5; i++) {
		System.out.printf("%d번째 수를 입력 : ", i);
		int n =sc.nextInt();
		if(n<0) {
			continue; // 해당부분만 탈출
		}
		else {
			sum+=n;}
	}
	
		System.out.println(sum);
	}

}
