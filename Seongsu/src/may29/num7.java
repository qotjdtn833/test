package may29;
class AA{
	final void ride() {
		System.out.println("AA클래스");
	}
	void load() {
		System.out.println("aa");
	}
}
class BB extends AA{
	void ride() {
		System.out.println("AA클래스");
	}
	void load(int n) {
		System.out.println("bb"+n);
	}
}
public class num7 {

	public static void main(String[] args) {
		
		// 오버라이딩 : 부모클래스를 물려받은 함수가 있을때.
		//자식클래스에서 그 함수를 재정의하게 되면 부모 클래스에 있는 함수는 기각된다.
		AA a = new AA();
		a.ride();
		a.load();
		BB b = new BB();
		b.ride();
		b.load(55);

	}

}
