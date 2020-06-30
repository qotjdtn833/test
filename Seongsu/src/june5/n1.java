package june5;

import java.util.Scanner;
abstract class Calc{
	double op1, op2;
	void set(double op1, double op2) {
		this.op1=op1;
		this.op2=op2;
}
	abstract double calculate();
}
	
	class Add extends Calc{
		double calculate() {
			return op1+op2;
		}
		
	}
	class Sub extends Calc{
		double calculate() {
			return op1*op2;
		}
		
	}
public class n1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("두 피연산자와 연산자 입력");
	double a = sc.nextDouble();
	double b = sc.nextInt();
	char op= sc.next().charAt(0); // '+'
	
	Calc c; // Calc c = new Add();
	switch(op) {
	case '+':
		c=new Add();
		break;
	
	case '*':
		c=new Sub();
		break;
	}
	
	}
}

