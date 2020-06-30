package may29;
class Books{
	String n;
	Books(){
		System.out.println("Book 클래스 생성자~~ (파라미터없음) ");
	}
	Books(String n){
		this(); //다른 생성자 호출하는 키워드
		this.n =n;
		System.out.println("Book 클래스 생성자 ->" + n);
	}
}

class Computer extends Books{
	
	Computer(String n){
		super(n);
		//Book(String n){
		//this(); //다른 생성자 호출하는 키워드
		//this.n =n;
		//System.out.println("Book 클래스 생성자 ->" + n);
		System.out.println("ComputerBook 클래스 생성자 ~~");
	}
	
	}

public class num5 {

	public static void main(String[] args) {
		Computer sedan1 = new Computer("굿 자바");

	}

}
