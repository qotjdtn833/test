import java.util.Scanner;

public class doubleif2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String s = sc.next();
		int b = sc.nextInt();
		
		
	
		switch(s) {
		case "+" :
			System.out.printf("%d + %d = %d",a,b,a+b);
			break;
			
		case "-" :
			System.out.printf("%d - %d = %d",a,b,a-b);
			break;
			
		case "*" :
			System.out.printf("%d * %d = %d",a,b,a*b);
			break;
			
		case "/" :
			System.out.printf("%d / %d = %d",a,b,a/b);
			break;
		
		case "%" :
			System.out.printf("%d %% %d = %d",a,b,a%b);
			break;
			
		}
		}
		
		
		
		

}

