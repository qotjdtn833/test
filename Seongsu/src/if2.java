import java.util.Scanner;

public class if2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� a�� �Է��Ͻÿ�.");
		int a = sc.nextInt();
		System.out.println("���� b�� �Է��Ͻÿ�");
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
