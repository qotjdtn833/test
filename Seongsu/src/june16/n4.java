package june16;

public class n4 {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "Python";
		
		int r= s1.compareTo(s2); // 2개의 두 문자열을 비교하고 int형 값을 반환
									// A=B 0 ,A<B 음수 ,A>B 양수 반환
		if(r==0) {
			System.out.println("두 문자열은 같다");			
		}
		else if(r<0) {
			System.out.println("s1이 s2보다 먼저 나온다");
		}
		else {
			System.out.println("s2가 s1보다 먼저 나온다");
		}
	}

}
