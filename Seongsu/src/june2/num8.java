package june2;
abstract class Ab{
abstract int multi(int a, int b); }

class Aa extends Ab{
	
	int multi(int a, int b) {
		return a*b;
		
	}
}
public class num8 {

	public static void main(String[] args) {
		Aa a= new Aa();
		System.out.println(a.multi(2, 10)); // 20Ãâ·Â
	}

}
