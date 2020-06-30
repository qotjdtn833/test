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
		System.out.printf("%d년도에 %s에서 %s ost인 %s",n,c,b,a);
	}
}
public class num3 {

	public static void main(String[] args) {
		Song s=new Song("Let it go","겨울왕국",2013,"미국");
				s.show();

	}

}
