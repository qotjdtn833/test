package june5;
class Per{
	String name;
	Per(String name){
		this.name=name;
	}
}
class Stu extends Per{
	Stu(String name){
		super(name);
	}
	public void outt() {
		System.out.println(name);
	}
}

public class n4 {

	public static void main(String[] args) {
		Per p = new Stu("tom");
		Stu s ;
		 //up
		s=(Stu)p; //down �θ�=(�ڽ��� Ŭ���� ��)
		s.outt();
		
		
		
		// p.outt(); >> �̷��� �ϸ� ������  outt �Լ�
		
	}

}
