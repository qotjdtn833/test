package may28;

import java.util.Scanner;

public class num10 {
	
	static void exp(int a, int b) {
		int n= 1;
		for(int i=0; i<b; i++) {
			n*=3;
		}
	System.out.println(n);
	}
	
	static void func(int n) {
		System.out.printf("¸ò: %d", n/5);
		System.out.printf("³ª¸ÓÁö: %d\n", n%5);
	}
	
	static void pr(int a[], int b) {
		int cnt = 0;
		int n;
		for(int i = 0; i< a.length; i++) {
			cnt=a[i];
			n=(cnt/b);
			for(int j =0; j<n; j++) {
				System.out.print("#");
		}
			System.out.println();
		}


	}
	
	public static void main(String[] args) {
		System.out.println("-----4----");
		int a[][] = new int[3][4];
		int n=0;
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=n;
				System.out.printf("%d ",n);
				n++;
				
				
				
			}
			n-=3;
			System.out.println();
		}
		

			System.out.println("---------5--------");
		exp(3,10);
		
		System.out.println("------6------");
		
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		func(c);
		
		System.out.println("----------7---------");
		int score[] = new int[] {58, 60, 86, 90, 84};
		pr(score, 5);
		
		System.out.println("----------8---------");
		int d;
		int f=0;
		int sum1 = 0;
		double avg1 ;
		
		int [][] ary = {{43,97},{34,77,87},{100,95,38,89}};
		for(int i =0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				f++;
				d= ary[i][j];
				sum1+=d;
				
				
			}
			
			
		}
		System.out.println("ÇÕÀº" + sum1);
		System.out.println("Æò±ÕÀº" + sum1/f);
	
		System.out.println("---------9---------");
		String str1 = "°øºÎ´Â ¾î·ÆÁö¸¸, Àç¹Õ³×¿ä" ;
		System.out.println((str1.substring(0, 8)));
		System.out.println((str1.substring(9, 14)));
		System.out.println(str1.charAt(6));
		System.out.println(str1.substring(0, 3));
				
	}
	

}
