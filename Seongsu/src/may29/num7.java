package may29;
class AA{
	final void ride() {
		System.out.println("AAŬ����");
	}
	void load() {
		System.out.println("aa");
	}
}
class BB extends AA{
	void ride() {
		System.out.println("AAŬ����");
	}
	void load(int n) {
		System.out.println("bb"+n);
	}
}
public class num7 {

	public static void main(String[] args) {
		
		// �������̵� : �θ�Ŭ������ �������� �Լ��� ������.
		//�ڽ�Ŭ�������� �� �Լ��� �������ϰ� �Ǹ� �θ� Ŭ������ �ִ� �Լ��� �Ⱒ�ȴ�.
		AA a = new AA();
		a.ride();
		a.load();
		BB b = new BB();
		b.ride();
		b.load(55);

	}

}
