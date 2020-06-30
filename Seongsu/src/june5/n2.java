package june5;
class Profile{
	boolean login(String id, String pw) {
		//id == lee, pw ==1234
		if(id.equals("lee")&&pw.equals("1234")) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
public class n2 {
	
	public static void main(String[] args) {
		Profile p = new Profile(); // 생성자 없으면 바로 함수 만들어도 됨
		boolean  result = p.login("lee", "1234");
		if(result) { //boolean 값
			System.out.println("로그인 됨");
			p.logout("lee");
		}
		else {
			System.out.println("id, pw틀렸다");
		}
	}

}
