import java.util.Scanner;

public class if1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("성적을 입력하시오");
	int grade = sc.nextInt();
	char g;
	if(grade >= 90) {
		System.out.println('A');
	}
	else if((grade<90)&&(grade>=80)) {
		System.out.println('B');
	}
	else if((grade<80)&&(grade>=70)) {
		System.out.println('C');
	}
	else {
		System.out.println('D');
	}
	}

}
