package june5;
class Po{
// private �� ���� class ���
private int x, y;
public Po(int x, int y){
this.x=x; 
this.y=y; }
public int getx() { return x; }
public int gety() { return y; }
protected void move(int x,int y) { this.x=x; this.y=y; } 
}
class Color extends Po{
	String s;
	Color(int x, int y, String s){
	super(x, y);
	this.s=s;
	}
	void setxy(int x, int y) {	
		move(x,y);
	}
	
	void setcolor(String s) {
		this.s=s;
	}
	public String toString() {
		return s+"��"+getx()+","+gety(); //�Լ�
	}
}

public class n3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color c = new Color(5,5,"blue");
		c.setxy(10,20);
		c.setcolor("red");
		String str = c.toString( );
		System.out.println(str); // red�� 10,20 ���
	}

}
