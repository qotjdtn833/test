package may29;

import java.util.Scanner;

class Pet{
	String a;
	int b;
	Pet(String a){
		this.a=a;
	}
		
	Pet(String a, int b){
		this.a=a;
		this.b=b;
	}
	void move() {
		System.out.println(a+"가 움직입니다.");
		System.out.println(a+"는 "+b+"개월 입니다.");
	}
	
		
	}
	

public class num10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		
		Pet p1 = new Pet(str);
		p1.move();
		
		Pet p2 = new Pet(str, n);
		p2.move();
		

	}

}
