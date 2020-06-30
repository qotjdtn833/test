package june16;

import java.util.Scanner;
import java.util.Vector;
class MovieTread{
	
}

public class n6vec {

	public static void main(String[] args) {
	int n;
	Scanner sc =new Scanner(System.in);
	System.out.println("1~100까지 안에서 정수를 입력 :");
	n=sc.nextInt();
	
	int a=n/10;
	int b=n%10;
	
	switch(a) {
	case 3:
	case 6:
	case 9:
		if(b==3 || b==6 || b==9) {
			//a,b 둘중에 하나
			System.out.println("짝짝");
			break;
		}
		else {//a는 3,6,9 수 중 하나지만 b는 아닐경우
			System.out.println("짝");
			break;
		}
	
		default: //a가 369 수가 아닐 때
			if(b==3 || b==6 || b==9) {
				System.out.println("짝");
				break;
			}
			else {
				System.out.println("꽝");
				break;
			}
	}

}
}
