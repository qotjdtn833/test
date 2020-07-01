package java2;

public class EqualsTest {

	public static void main(String[] args) {

		Student studentLee = new Student (100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");
	
		if(studentLee == studentSang) {// 내용은 같지만 주소는 다름
			System.out.println("가틍ㅁ");
		}
		else {
			System.out.println("다름");
		}
		if(studentLee == studentLee2) { //주소가 동일
			System.out.println("같음");
		}
		else {
			System.out.println("다름");
		}
	
		if(studentLee.equals(studentSang)) {
			System.out.println("내용이 같음");
		}
		else {
			System.out.println("내용이다름");
		}
	
		if(studentLee.equals(studentLee2)) {
			System.out.println("내용이 같음");
		}
		else {
			System.out.println("내용이다름");
		}
		// 인스턴스
		System.out.println(studentLee.hashCode());
	}

}
