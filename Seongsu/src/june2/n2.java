package june2;

import java.util.Scanner;

class Student{
	String a;
	String b;
	Student(String a, String b) {
		this.a=a;
		this.b=b;
	}
	void pr() {
		System.out.println(a+" , "+b);
	}
}
class Cal{
	int a; int b;
	Cal(int a, int b){
		this.a=a; this.b=b;
	}
	static int add(int a, int b) {
		return a+b;
	}
	static int div(int a, int b) {
		return a/b;
	}
}
public class n2 {
	
	public static int multi(int a, int b) {
		int mul =1;
		for(int i=a; i<=b; i++) {
			mul*=i;
			
		}
		return mul;
	}
	
	public static void main(String[] args) {
		System.out.println("--------1.----------");
		Student s1 = new Student("��浿", "kim");
		Student s2 = new Student("ȫ�浿", "hong");
		s1.pr();
		s2.pr(); // ��� ������ ���
		
		System.out.println("--------2.-----------");
		int a = Cal.add(10,5); //��
		int b = Cal.div(10,5); //��
		System.out.println(a+" "+b);
		//Ŭ������ ������ static int ���
		
		System.out.println("-------3.-------");
		String eng[] = {"book", "note", "apple"};
		String kor[] = {"å", "��Ʈ","���"};
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			String c = sc.next();
			if(c.equals(eng[0])) {
				System.out.println(kor[0]);
			}
			else if(c.equals(eng[1])) {
				System.out.println(kor[1]);
			}
			else if(c.equals(eng[2])) {
				System.out.println(kor[2]);
			}
			else if(c.equals("exit")) {
				System.out.println("Ż��");
				break;
			}
			
		}
	System.out.println("------4.------");
	System.out.println(multi(1,10));
	
	System.out.println("-------5.-----");
	int ary1[] = {-1, 4, -2, 6, 3};
	int sum1 = 0;
	for(int i=0; i<5; i++) {
		if(ary1[i]>0) {
			continue;
		}
		else {
			sum1+=ary1[i];
		}
		 
	}
	System.out.println(sum1);
	
	
	}

}
