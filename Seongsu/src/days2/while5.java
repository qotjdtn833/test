package days2;

import java.util.Scanner;

public class while5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ϳ��� ������ �Է� : ");
		int a = (int)(Math.random()*100)+1;
		System.out.println(a);
		
		while(true) {
			if(a<50) {
				System.out.println("50�̸�");
				break;
			}
			else {
				System.out.println("Ż��");
				break;
				
				
				
			}
			
		}
		

	}

}
