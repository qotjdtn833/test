package june4;
//인터페이스
interface Person{
    String work(); }

class Worker implements Person{
	public String work() {
		return "일한다";
	}
}
class Student implements Person{
	public String work() {
		return "공부한다";

	}
}

public class n4 {
    static void pr(Person p){
System.out.println(p.work()); }

	public static void main(String[] args) {
		// TODO  Auto-generated method stub
		pr(new Worker());
		//person p = new worker// 일한다
		pr(new Student());    //공부한다 출력
		//person p = new student
	}

}
