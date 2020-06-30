package june1;

public class num8 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			System.out.println("aa");
			// 예외가 발생할 수도 있는 코드
			// 예외가 발생하는 순간 catch로 넘어간다.
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없다");
		}
		finally { //예외여부와 상관없이 무조건 실행됨
			System.out.println("자바자바");
		}
	}

}
