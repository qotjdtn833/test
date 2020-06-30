package may29;
class Person{
	private String name;
	Person(String name){
		this.name=name;
	}

	void na() {
		System.out.println("내 이름은"+name);
	}
}
	// 자식 = 서브 = 하위클래스
class Student extends Person{
	private String school;
	private int year;
	Student(String name, String s, int y){
		
		super(name); // 부모 생성자 호출!!
					// 
		school=s;
		year=y;
	}
void pr() {
	System.out.println("내학교는 "+school);
	System.out.println("나는"+year+"학년");
	//부모 클래스에 있는 함수 물려받음
}
}
public class num4 {

	public static void main(String[] args) {
		Student s1 = new Student("종훈", "A",3);
		s1.pr();
		
		Student s2 = new Student("완우", "B",1);
		s2.na();

	}

}
