package java2;

public class EqualsTest {

	public static void main(String[] args) {

		Student studentLee = new Student (100, "�̻��");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "�̻��");
	
		if(studentLee == studentSang) {// ������ ������ �ּҴ� �ٸ�
			System.out.println("���v��");
		}
		else {
			System.out.println("�ٸ�");
		}
		if(studentLee == studentLee2) { //�ּҰ� ����
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ�");
		}
	
		if(studentLee.equals(studentSang)) {
			System.out.println("������ ����");
		}
		else {
			System.out.println("�����̴ٸ�");
		}
	
		if(studentLee.equals(studentLee2)) {
			System.out.println("������ ����");
		}
		else {
			System.out.println("�����̴ٸ�");
		}
		// �ν��Ͻ�
		System.out.println(studentLee.hashCode());
	}

}
