package june1;

public class num8 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			System.out.println("aa");
			// ���ܰ� �߻��� ���� �ִ� �ڵ�
			// ���ܰ� �߻��ϴ� ���� catch�� �Ѿ��.
		}catch(Exception e) {
			System.out.println("0���� ���� �� ����");
		}
		finally { //���ܿ��ο� ������� ������ �����
			System.out.println("�ڹ��ڹ�");
		}
	}

}
