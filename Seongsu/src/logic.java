import java.util.Scanner;

public class logic {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("a�� ���� �Է��ϼ���.");
double a=sc.nextDouble();
System.out.println("b�� ���� �Է��ϼ���.");
double b=sc.nextDouble();
double div= a%b;

System.out.printf("%f %% %f�� %d",a,b,(int)div);

	}

}
