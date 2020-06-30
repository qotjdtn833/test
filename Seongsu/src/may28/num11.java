package may28;

import java.util.Scanner;

public class num11 {

	public static void main(String[] args) {
		String []day = {"월","화","수"};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		switch(n%3) {
		case 0:
			System.out.println("월");
			break;
		}

	}

}
