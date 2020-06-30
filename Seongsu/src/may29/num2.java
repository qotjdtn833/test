package may29;
class Book{
	String r;
	int n;
	
	Book(String r, int n){
		this.r=r;
		this.n=n;
		
	}
	Book(String r){
		this.r=r;
		n=0;
	}
	void show() {
		System.out.println(r + "는" + n);
	}
}
public class num2 {

	public static void main(String[] args) {

		Book b1 = new Book("자바",30000);
		Book b2 = new Book("파이썬");
		b1.show();//자바는 30000원
		b2.show();//파이썬은 무료

	}

}
