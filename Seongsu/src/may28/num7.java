package may28;

import java.util.Scanner;

public class num7 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		
		for(int i =1; i<a.length; i++) {
			a[i]=sc.nextInt();
			if(a[i]%4==0) {
				System.out.println(a[i]);
			}
			
		}

	}

}
