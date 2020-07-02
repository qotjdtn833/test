package java702;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		//객체 생성하여 클래스 이름 획득
		Person person = new Person();

		// object의 getclass() 메소드를 사용
		Class pClass1=person.getClass();
		System.out.println(pClass1.getName());
		//클래스가 접근해서 클래스 이름을확득
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		//클래스 이름으로 가져오기
		Class pClass3 = Class.forName("java702.Person");
		System.out.println(pClass3.getName());
		
		

	}

}
