import java.util.Scanner;

public class if5 {

	public static void main(String[] args) {
		//������ �г��� ������ �Է�
		//70�� �̻��̸� �հ�,3�г�  80�� �̻��� ��� �հ�
		Scanner sc= new Scanner(System.in);
		System.out.println("������ �Է�:");
		int score = sc.nextInt();
		System.out.println("�г��� �Է�:");
		int grade = sc.nextInt();
		
		if(grade==3) {
			if(score>=80) {
				System.out.println("�հ�");
			}
			else {System.out.println("���հ�");
		}
	}
		else {
			if(score>=70) {
				System.out.println("�հ�");
			}
			else {System.out.println("���հ�");
			
			}
		}

}
}
