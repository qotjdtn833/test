package test1;

public class num5 {

	public static void main(String[] args) {
		
		
		while(true) {
			int x = (int)((Math.random()*5)+1);
			int y = (int)((Math.random()*5)+1);
			System.out.println("x�� ����" + x);
			System.out.println("y�� ����" + y);
			if(x+y==5) {
				System.out.println("�������");
				break;
			}
			else {
				System.out.println("�ٽ� ����");
			}
		}
	}

}
