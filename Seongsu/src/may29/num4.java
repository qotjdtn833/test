package may29;
class Person{
	private String name;
	Person(String name){
		this.name=name;
	}

	void na() {
		System.out.println("�� �̸���"+name);
	}
}
	// �ڽ� = ���� = ����Ŭ����
class Student extends Person{
	private String school;
	private int year;
	Student(String name, String s, int y){
		
		super(name); // �θ� ������ ȣ��!!
					// 
		school=s;
		year=y;
	}
void pr() {
	System.out.println("���б��� "+school);
	System.out.println("����"+year+"�г�");
	//�θ� Ŭ������ �ִ� �Լ� ��������
}
}
public class num4 {

	public static void main(String[] args) {
		Student s1 = new Student("����", "A",3);
		s1.pr();
		
		Student s2 = new Student("�Ͽ�", "B",1);
		s2.na();

	}

}
