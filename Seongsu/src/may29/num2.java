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
		System.out.println(r + "��" + n);
	}
}
public class num2 {

	public static void main(String[] args) {

		Book b1 = new Book("�ڹ�",30000);
		Book b2 = new Book("���̽�");
		b1.show();//�ڹٴ� 30000��
		b2.show();//���̽��� ����

	}

}
