package june9;

import java.util.Scanner;

public class n1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int ary[] = new int[a];
	
	for(int i=0; i<ary.length; i++) {
		ary[i]=(int)(Math.random()*100)+1;
		System.out.println(ary[i]);
	}
	}

}
