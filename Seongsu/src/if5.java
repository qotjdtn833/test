import java.util.Scanner;

public class if5 {

	public static void main(String[] args) {
		//점수와 학년을 정수로 입력
		//70점 이상이면 합격,3학년  80점 이상일 경우 합격
		Scanner sc= new Scanner(System.in);
		System.out.println("점수를 입력:");
		int score = sc.nextInt();
		System.out.println("학년을 입력:");
		int grade = sc.nextInt();
		
		if(grade==3) {
			if(score>=80) {
				System.out.println("합격");
			}
			else {System.out.println("불합격");
		}
	}
		else {
			if(score>=70) {
				System.out.println("합격");
			}
			else {System.out.println("불합격");
			
			}
		}

}
}
