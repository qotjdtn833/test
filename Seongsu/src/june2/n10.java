package june2;
abstract class Ca{
	abstract int cal(int a, int b);
	//a���� b���� ���� ���
}
class Da extends Ca{
	int cal(int a, int b) {
		int sum=0;
		for(int i=a; i<b; i++) {
			sum+=i;
		
		}
	return sum;
	}
}
public class n10 {

	public static void main(String[] args) {
		Da a = new Da();
		System.out.println(a.cal(3, 10));

	}

}
