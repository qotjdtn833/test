package days2;

import java.util.Scanner;

public class while6 {
    // ������ ��� ������ ���� ����� �ո� ���
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum =0;
	for(int i=1; i<=5; i++) {
		System.out.printf("%d��° ���� �Է� : ", i);
		int n =sc.nextInt();
		if(n<0) {
			continue; // �ش�κи� Ż��
		}
		else {
			sum+=n;}
	}
	
		System.out.println(sum);
	}

}
