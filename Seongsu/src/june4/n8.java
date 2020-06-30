package june4;
class Points{
	int a, b;
	Points(int a, int b){
		this.a=a;
		this.b=b;
	}
	public String toString() {
		return a+" , "+b;
	}
}

public boolean equals(Object obj) {
	Points p = (Points) obj;
	if(a==p.a && b==p.b) {
		return true;
	}
	else{ 
		return false;
	}
}
public class n8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Points p = new Points(3,4);
		Points q = new Points(3,5);
		System.out.println(p); /// 3,4
		//toString(), equals(
		
		if(p.equals(q)) {
			System.out.println("같은 값");
		}
		else {System.out.println("다른 값");
		
		}
	}

}
}