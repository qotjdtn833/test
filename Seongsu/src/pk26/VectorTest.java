package pk26;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		Object obj;
		//벡터방식의 크기2의 배열선언
		Vector<Object> vec = new Vector<Object>(2);
		
		obj=10;
		vec.addElement(obj); // 엘리먼트 추가
		//vector 용량 수
		System.out.println("용량은 #1 :"+vec.capacity());
		System.out.println("크기는 #1 :"+ vec.size());
		
		obj="HI";
		vec.addElement(obj); //엘리먼트 추가
		System.out.println("용량은 #2 :"+vec.capacity());
		System.out.println("크기는 #2 :"+ vec.size());
		
		obj="Nice Day";
		vec.addElement(obj); //엘리먼트 추가
		System.out.println("용량은 #3 :"+vec.capacity());
		System.out.println("크기는 #3 :"+ vec.size());
		
	}

}
