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
		     c1.set("ȫ�浿"); //������ �ڵ�� �Ȱ���
		     String s=c1.get();
		     System.out.println(s);
	}

}
