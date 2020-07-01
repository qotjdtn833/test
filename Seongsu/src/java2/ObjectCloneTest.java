package java2;

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Circle circle=new Circle(10,20,30);
		Circle copycircle= (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copycircle);
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copycircle));
		// 복사한 주소는 완전다름, 따로 메모리를 받아서 보관하고 있움
		// 복사한걸 뭘 하든 원본한테는 영향을 가지않는이유, 해쉬값
	}

}
