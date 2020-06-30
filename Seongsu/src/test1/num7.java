package test1;

import java.util.Scanner;

public class num7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a= 0;
		while(true) {
			a++;
			System.out.println("수를 입력 :");
			int number = sc.nextInt();
			if(number==18) {
				System.out.println("정답이다");
				break;
			}
			else if(number<18) {
				System.out.printf("%d보다 크다!!\n",number);
			}
			else {
				System.out.printf("%d보다 작다!!\n",number);
			}
		}
		System.out.println("시도한 횟수는"+ a + "번");
	}

}
