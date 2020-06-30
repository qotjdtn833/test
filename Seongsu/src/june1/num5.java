package june1;
import java.util.Scanner;

class show extends num5{
	int a;
	int b;
	int sum = 0;
	public int num5(int a, int b) {

		this.a=a;
		this.b=b;
		for(int i =a; i <b; i++) {
			sum+=a;
			
		
	  
	}

	}
}
public class num5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Cal c = new show();
		System.out.println(c.Cal(a,b));
		
		//a부터 b까지 합출력
	}

}
