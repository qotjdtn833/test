package may29;

import java.util.Scanner;

public class num11 {
	static void pr(double a[]) {
		Scanner sc= new Scanner(System.in);
		for(int i =0; i<a.length; i++) {
			a[i] = sc.nextDouble();
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {

		double dd[]=new double[5];
		pr(dd);
		//5�� �����Է¹޾� �Է��� ������ �� ����ϴ� �Լ�

	}

}
