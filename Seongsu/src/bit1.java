import java.util.Scanner;

public class bit1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하시오.");
		int age = sc.nextInt();
		if(age%2==0)
		{
			System.out.println("나이가 짝수");
		}
		else {
			System.out.println("나이가 홀수");
		}
		
        		
	
	}

}
