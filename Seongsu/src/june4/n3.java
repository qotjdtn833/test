package june4;
class Point{
	
	int a, b;
	
	void set(int a, int b) {
		this.a=a;
		this.b=b;
	}
	void show(){
		System.out.println(a+" , "+b);
	}
}


class Color extends Point{
	String s;
	
void setcolor(String s){
	this.s=s;
}
void showcolor() {
	System.out.println(s);
	show();
}

}

public class n3 {

	public static void main(String[] args) {
		
		Point p= new Point();
		p.set(10,20);
		p.show();     //(10,20)출력

		 Color c=new Color();
		c.set(20,30);
		c.setcolor("yellow");
		c.showcolor();
		}    //yellow(20,30) 출력

	}


