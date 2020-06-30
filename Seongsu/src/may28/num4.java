package may28;

import java.util.Scanner;

public class num4 {
	static void str(String a[], int b) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<b; i++) {
			String n = sc.next();
			a[i]=n;
			System.out.println(n);
		}
		
	}

	public static void main(String[] args) {
		String aa[] = new String[3];
		str(aa,3);

	}

}
