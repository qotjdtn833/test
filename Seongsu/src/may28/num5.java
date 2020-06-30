package may28;

import java.util.Scanner;

public class num5 {
		
				
			
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[5];
		int c[] = new int[5];
		int total[] = new int[5];
		double avg[] = new double[5];
		
		System.out.println("이름 국어 영어 수학 총점 평균\n");
		for(int i=0; i<5; i++) {
			a[i] =sc.nextInt();
			b[i] =sc.nextInt();
			c[i] =sc.nextInt();
			total[i] =a[i]+b[i]+c[i];
			avg[i]=total[i]/3.0;
		}
		String name[]=new String[] {"세인","현경","경민","도원","지원"};
		for(int i=0; i<6; i++) {
			System.out.println(a[i]+" ");
			System.out.println(b[i]+" ");
			System.out.println(c[i]+" ");
			System.out.println(total[i]+" ");
			System.out.println(avg[i]+" ");
			System.out.println(name[i]+" ");
			
		}
	}

}
