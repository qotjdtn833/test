package june2;
// 상속 클래스
abstract class Mul{
	abstract int multi(int a, int b);
}
class M extends Mul{

	int mul =1;
	int multi(int a, int b) {
		for(int i=1; i<b; i++) {
			mul*=a;
		}
	return mul;
	}
}

public class n1 {

	public static void main(String[] args) {

		M m = new M();
		System.out.println(m.multi(2,10));
		//2의 10승을 출력

	}

}
