package may29;
class Name{
	String n;
	int age;
	Name(String n, int age){
		this.n = n;
		this.age = age;	
	}
	void pro() {
		System.out.println(n+" "+age+"»ì");		
	}
}
class Age extends Name{
	String c;
	Age(String n, int age, String c){
		super(n, age);
		this.c = c;
	}
	
}

public class num12 {

	public static void main(String[] args) {
		
	}

}
