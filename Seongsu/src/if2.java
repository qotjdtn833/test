import java.util.Scanner;

public class if2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 a를 입력하시오.");
		int a = sc.nextInt();
		System.out.println("정수 b를 입력하시오");
		int b = sc.nextInt();
		double avg;
		avg = (double)((a+b)/2);
		if(avg >= 50) {
			System.out.println("good");
		}
		else {
			System.out.println("bad");
		}

	}

}
