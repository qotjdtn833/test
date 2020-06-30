package may28;

import java.util.Scanner;

public class num3 {
	static void avg(int a[], int b) {
		Scanner sc= new Scanner(System.in);
		
		int sum=0;
		for(int i =0; i<b; i++) {
			int c = sc.nextInt();
			a[i]=c;
			sum+=c;
			
		}
		System.out.println(sum/b);
	}
	public static void main(String[] args) {
		
		int aa[] = new int[5];
		avg(aa,5);

	}

}
