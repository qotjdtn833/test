package may29;
class Books{
	String n;
	Books(){
		System.out.println("Book Ŭ���� ������~~ (�Ķ���;���) ");
	}
	Books(String n){
		this(); //�ٸ� ������ ȣ���ϴ� Ű����
		this.n =n;
		System.out.println("Book Ŭ���� ������ ->" + n);
	}
}

class Computer extends Books{
	
	Computer(String n){
		super(n);
		//Book(String n){
		//this(); //�ٸ� ������ ȣ���ϴ� Ű����
		//this.n =n;
		//System.out.println("Book Ŭ���� ������ ->" + n);
		System.out.println("ComputerBook Ŭ���� ������ ~~");
	}
	
	}

public class num5 {

	public static void main(String[] args) {
		Computer sedan1 = new Computer("�� �ڹ�");

	}

}
