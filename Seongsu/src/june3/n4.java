package june3;
interface figure{
	//�������̽� ����
	//�ʵ� �޼���(�Լ�)�� �ۼ�
	void circle_area();
	void rec_area();
}
class Circle implements figure{
	public static final double pie = 3.14;
	int r;
	Circle(int r){
		this.r=r;
	}
	public void circle_area(){
		System.out.println(pie*r*r);
	}
	public void rec_area() {}; //���� �ȵǾ �����;���
}
	class rec implements figure{
	int a, b;
	rec(int a, int b){
		this.a=a;
		this.b=b;
	}
	public void rec_area(){
		System.out.println(a*b);
}
	public void circle_area(){};
	}
public class n4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		figure f1=new Circle(5);
		figure f2=new rec(2,5); 
		f1.circle_area(); 
		f2.rec_area();

	}

}
