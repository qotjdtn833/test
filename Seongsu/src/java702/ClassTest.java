package java702;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		//��ü �����Ͽ� Ŭ���� �̸� ȹ��
		Person person = new Person();

		// object�� getclass() �޼ҵ带 ���
		Class pClass1=person.getClass();
		System.out.println(pClass1.getName());
		//Ŭ������ �����ؼ� Ŭ���� �̸���Ȯ��
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		//Ŭ���� �̸����� ��������
		Class pClass3 = Class.forName("java702.Person");
		System.out.println(pClass3.getName());
		
		

	}

}
