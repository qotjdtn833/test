package june16;
class Circle{
	int a;
	Circle(int a){
		this.a=a;
	}
	public String toString() {
		return a+""; // 30+""="30"
	}
	public boolean equals(Circle c) {
		if(3.14*a*a == 3.14*c.a*c.a) {
			return true;
		}
	return false;
	}
}
public class n8 {

	public static void main(String[] args) {
		
		Circle a=new Circle(30);
        Circle b=new Circle(30);
        System.out.println("������"+a);
        System.out.println("������"+b);
 
        if(a.equals(b)) {
                   System.out.println("���� ��"); }
        else {
                   System.out.println("�ٸ� ��");}
	}

}
