import java.util.Scanner;

public class if4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("처리할 수를 입력하세요");
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("a는 양수 입니다.");
			
		}
		else if(a==0) {
			System.out.println("a는 0입니다.");
		}
		else {
			System.out.println("a는 음수입니다.");
		}

	}

}
