import java.util.Scanner;

public class Class {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하시오");
		int grade = sc.nextInt();
		char g;
		if(grade >= 90) {
			System.out.println(g='A');
		}
		else if(grade>=80) {
			System.out.println(g='B');
		}
		else if(grade>=70) {
			System.out.println(g='C');
		}
		else {
			System.out.println(g='F');
		}
	
}
}
