package may29;
class Tv{
	private int size;
	Tv(int size){
		this.size=size;
		
	}
	protected int get() {
		return size;
		
	}
	
}
class Iptv extends Tv{
	String com;
	Iptv(String com, int size){
		super(size);
		this.com = com;// �θ������ ȣ��
	}
	void pr() {
		System.out.println(com + get() +"��ġ"); // private ������ size�� ���������Ƿ�
											 	// �Լ��� ������
	}
}
public class num6 {

	public static void main(String[] args) {
		Iptv i1=new Iptv("�Ｚ", 32);
		i1.pr(); // �Ｚ 32��ġ tv

	}

}
