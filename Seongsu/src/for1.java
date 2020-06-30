import java.util.Scanner;

public class for1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력 : ");
		int a = sc.nextInt();
		
		if(a%5==0) {
			System.out.println("5의배수");
	
		}
		else {System.out.println("아님~");

	}

}
}