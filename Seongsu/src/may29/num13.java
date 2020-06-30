package may29;
abstract class Cal{

public abstract int add(int a,int b);
public abstract int multi(int a, int b);
public abstract double avg(int ary[]);

}
class Ca extends Cal{
	public int add(int a,int b) {
		return a+b;
	}
	public int multi(int a, int b){
		return a*b;
	}
	public double avg(int ary[]){
		int sum = 0;
		for(int i=0; i<ary.length; i++) {
			sum+=ary[i];
		}
			return sum/ary.length;
	}
}
class BB extends AA{
		void aa() {
			System.out.println("aa");
		}
}
public class num13 {

	public static void main(String[] args) {
		
		Ca c=new Ca();
		System.out.println(c.add(4,6));
		System.out.println(c.multi(2,8));
		System.out.println(c.avg(new int [] {5,7,9}));
	}

}
