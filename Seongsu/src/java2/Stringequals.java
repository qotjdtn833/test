package java2;

public class Stringequals {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // 해쉬코드
		
		// String 클래스의 equals 메소드가 재정의
		System.out.println(str1.equals(str2)); 
		
		Integer i1 = new Integer(100); //박싱 , 언박싱
		Integer i2 = new Integer(100); //박싱 , 언박싱
		
	}
		
		
		
}
