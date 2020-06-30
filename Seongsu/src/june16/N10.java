package june16;
interface Po{
	public void pr(int a, String b);
	public void pr(String c);
	
}
class Point implements Po{
	int a; String b;
	Point(){}
	public void pr(int a, String b) {
		System.out.println(a + b);
	}
	public void pr(String b) {
		System.out.println(b);
	}
}
public class N10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Po p=new Point();
        
		p.pr(30000,"java");
		p.pr("python"); 
	}

}
