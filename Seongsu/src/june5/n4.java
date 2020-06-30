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
		s=(Stu)p; //down 부모=(자식의 클래스 명)
		s.outt();
		
		
		
		// p.outt(); >> 이렇게 하면 오류남  outt 함수
		
	}

}
