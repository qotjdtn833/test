package java702;

public class StringBuilderTset {

	public static void main(String[] args) {
		//immutable 불변한거 
		String javaStr = new String("java");
		//처음 객체의 인스턴스화시 메모리값
		System.out.println("javaStr의 문자열 주소 : "+System.identityHashCode(javaStr));
		//String으로 부터 StringBuilder에 객체를 생성
		//buffer은 heap메모리에 hash값 저장되어있음
		StringBuilder buffer = new StringBuilder(javaStr);
		//연산이 이루어지기 전 원본 hash값
		System.out.println("연산 전 Buffer의 메모리 주소 : "+ System.identityHashCode(buffer));
		
		buffer.append(" and ");
		buffer.append("android");
		buffer.append("Programming is fun!");
		System.out.println("연산 후 Buffer의 메모리 주소 : "+ System.identityHashCode(buffer));
		
		javaStr=buffer.toString();
		
		System.out.println("새로 만들어진 javaStr의 문자열 주소"+System.identityHashCode(javaStr));
	}

}
