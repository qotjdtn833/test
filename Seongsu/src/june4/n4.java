package june4;
//�������̽�
interface Person{
    String work(); }

class Worker implements Person{
	public String work() {
		return "���Ѵ�";
	}
}
class Student implements Person{
	public String work() {
		return "�����Ѵ�";

	}
}

public class n4 {
    static void pr(Person p){
System.out.println(p.work()); }

	public static void main(String[] args) {
		// TODO  Auto-generated method stub
		pr(new Worker());
		//person p = new worker// ���Ѵ�
		pr(new Student());    //�����Ѵ� ���
		//person p = new student
	}

}
