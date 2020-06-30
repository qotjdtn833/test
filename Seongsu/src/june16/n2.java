package june16;

import java.util.Scanner;
class Con<T>{
	T a;
	void set(T a) {
		this.a=a;
		
	}
	T get() {
		return a;
	}
}

public class n2 {
	
	public static void main(String[] args) {
	
		  Con<String> c1= new Con<String>();
		     c1.set("홍길동"); //생성자 코드랑 똑같음
		     String s=c1.get();
		     System.out.println(s);
	}

}
