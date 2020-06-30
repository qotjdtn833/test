package june2;

class Rectangle{
private int width;
Rectangle(int width){ this.setWidth(width);}
int get(){ return getWidth();}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
}
class Rec extends Rectangle{
	String n;
	Rec(int width, String n){
		super(width);
		this.n=n;}
		void show() {
		System.out.println(n+" , ³Êºñ´Â"+ getWidth());
	
		
	}
}

public class n6 {

	public static void main(String[] args) {
		Rec r= new Rec(10,"rectangle");
		r.show(); //rectangle


	}

}
