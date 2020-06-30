package june10;

import java.util.Scanner;


public class n1 {
	static int sum = 0;
	static int sum1 = 0;
	
	static int add(int aa[], int b) {
		for(int i =0; i<b; i++) {
			sum+=i;
		}
		return sum;
	}
	
	static int add(int aa[], int b, int bb[]) {
		for(int i =0; i<b; i++) {
			sum+=i;
		}
		for(int j =bb[0]; j<j+bb.length; j++) {
			sum1+=j;
	}
	return sum+sum1;
	}
	public static void main(String[] args) {
		
	int a[] = {1,2,3,4,5};
	int b[] = {6,7,8,9,10};
	
	int c = add(a,5);
	int d = add(a,5,b);
	
	System.out.println(c); //1부터 5까지 합
	System.out.println(d); // 1부터 10까지 합
	
	}

}
