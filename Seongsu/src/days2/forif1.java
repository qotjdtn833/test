package days2;

public class forif1 {

	public static void main(String[] args) {
		int i;
		int sum=0;
		for(i=0; i<10; i++) {
			sum+=i;
			if(sum>=30) {
				break;
				
		}
			
		}
		System.out.println("������ �� : " + sum);
		System.out.println("���������� ������ �� :"+ i);
	}

}
