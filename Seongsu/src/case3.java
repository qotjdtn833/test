import java.util.Scanner;

public class case3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘 아침인가요? 점심인가요?");
		String st = sc.next();
		
		switch (st) {
		case "M":
			System.out.println("Morning");
			break;
			
		case "A":
			System.out.println("Afternoon");
			break;
			
		default:
			System.out.println("Error");
			break;
		}

	}

}
