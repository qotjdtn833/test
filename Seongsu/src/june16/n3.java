package june16;
class point{
	int a, b;
	point(int a, int b){
		this.a=a; this.b=b;
	}
	public boolean equals(point p) {
		if(a*b == p.a*p.b) {
			return true;
		
		}
		return false;
	}
}

public class n3 {

	public static void main(String[] args) {
		point p1 = new point(4,6);
		point p2 = new point(6,9);
		point p3 = new point(12,2);
		
		if(p1.equals(p2)) {
			System.out.println("p1과 p2면적은 같다");
		}
		if(p1.equals(p3)) {
			System.out.println("p1과 p3 면적은 같다");
		}
		if(p2.equals(p3)) {
			System.out.println("p2와 p3 면적은 같다");
	
	}

}
}
