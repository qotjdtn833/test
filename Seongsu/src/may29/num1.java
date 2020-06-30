package may29;
class A{
	int r;
	String name;
	A(){
		r=1;
		name=" ";
	}
A(int r, String n){
	this.r=r;
	name=n;
}
 double area() {
	 return r*r*3.14;
 }
}

public class num1 {

	public static void main(String[] args) {

		A a= new A(); // r=1
		double b= a.area();
		System.out.println(b+" "+a.name);
		
		A aa=new A(10,"Å¸¿ø");
		System.out.println(a.area()+" "+aa.name);

	}

}
