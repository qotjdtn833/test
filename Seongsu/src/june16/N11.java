package june16;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class N11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Name ary[] = new Name[3]; // ��ü �迭����
		
		for(int i=0; i<ary.length; i++) {
			System.out.println("�̸� �Է�:");
			ary[i]=new Name(sc.next()); //��ü�����Ͽ� ��ü�迭�� �ֱ�
			
			
			
		}
		int n=0;
		while(true) {
			int ary1[]=new int[3];
			
			for(int i=0; i<ary1.length; i++) {
				ary1[i]=(int)(Math.random()*3)+1;
				System.out.print(ary1[i]);
			}
			if(ary[1]==ary[2] && ary[2]==ary[3] ) {
				System.out.println(ary[n]+"�� �¸��Ͽ���.");
				break;
			}
			else {
			n++;
			n=n%3;
			}
		}
	}

}
