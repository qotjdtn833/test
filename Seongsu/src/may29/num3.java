package may29;
class Song{
	String a,b,c;
	int n;
	
	Song(String a, String b, int n, String c){
		this.a=a;
		this.b=b;
		this.n=n;
		this.c=c;
	}
	void show() {
		System.out.printf("%d�⵵�� %s���� %s ost�� %s",n,c,b,a);
	}
}
public class num3 {

	public static void main(String[] args) {
		Song s=new Song("Let it go","�ܿ�ձ�",2013,"�̱�");
				s.show();

	}

}
