package june2;
class Movie{
	String a; int n;
	
	Movie(String a) {
	this.a=a;
	n=12;
	}
	
	Movie(String a, int n) {
		this.a=a;
		this.n=n;
		}
	void pr() {
		System.out.println(a + n);
	}

}
public class n3 {

	public static void main(String[] args) {
		Movie m1 = new Movie("�����");
		m1.pr();
		Movie m2 = new Movie("�ܿ�ձ�",11);
		m2.pr();

	}

}
