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
		Profile p = new Profile(); // ������ ������ �ٷ� �Լ� ���� ��
		boolean  result = p.login("lee", "1234");
		if(result) { //boolean ��
			System.out.println("�α��� ��");
			p.logout("lee");
		}
		else {
			System.out.println("id, pwƲ�ȴ�");
		}
	}

}
