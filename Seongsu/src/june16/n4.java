package june16;

public class n4 {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "Python";
		
		int r= s1.compareTo(s2); // 2���� �� ���ڿ��� ���ϰ� int�� ���� ��ȯ
									// A=B 0 ,A<B ���� ,A>B ��� ��ȯ
		if(r==0) {
			System.out.println("�� ���ڿ��� ����");			
		}
		else if(r<0) {
			System.out.println("s1�� s2���� ���� ���´�");
		}
		else {
			System.out.println("s2�� s1���� ���� ���´�");
		}
	}

}
