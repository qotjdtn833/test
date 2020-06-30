package june16;
class Friend{
	private String name;
	private String phone;
	
	Friend(String name, String phone){
		this.name=name; this.phone=phone;
	}
	String get() {
		return name;
	}
}
class ITFriend extends Friend {
	String a; 
	ITFriend(String name, String phone, String a ){
		super(name, phone);
	this.a=a;
	}
		void show() {
			System.out.println(a+"에 관심있는 "+get());
		}
	
}
public class n9 {

	public static void main(String[] args) {
		ITFriend it=new ITFriend("홍길동", "010-111-1111", "컴퓨터");

		it.show(); 
	}

}
