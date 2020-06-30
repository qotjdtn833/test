package june16;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class N11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Name ary[] = new Name[3]; // 객체 배열생성
		
		for(int i=0; i<ary.length; i++) {
			System.out.println("이름 입력:");
			ary[i]=new Name(sc.next()); //객체생성하여 객체배열에 넣기
			
			
			
		}
		int n=0;
		while(true) {
			int ary1[]=new int[3];
			
			for(int i=0; i<ary1.length; i++) {
				ary1[i]=(int)(Math.random()*3)+1;
				System.out.print(ary1[i]);
			}
			if(ary[1]==ary[2] && ary[2]==ary[3] ) {
				System.out.println(ary[n]+"이 승리하였다.");
				break;
			}
			else {
			n++;
			n=n%3;
			}
		}
	}

}
