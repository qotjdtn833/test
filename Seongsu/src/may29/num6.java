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
		this.com = com;// 부모생성자 호출
	}
	void pr() {
		System.out.println(com + get() +"인치"); // private 때문에 size를 못가져오므로
											 	// 함수를 가져옴
	}
}
public class num6 {

	public static void main(String[] args) {
		Iptv i1=new Iptv("삼성", 32);
		i1.pr(); // 삼성 32인치 tv

	}

}
