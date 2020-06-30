import java.util.Scanner;

public class logic {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("a의 값을 입력하세요.");
double a=sc.nextDouble();
System.out.println("b의 값을 입력하세요.");
double b=sc.nextDouble();
double div= a%b;

System.out.printf("%f %% %f는 %d",a,b,(int)div);

	}

}
