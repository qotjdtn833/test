package may28;

public class num9 {

	public static void main(String[] args) {
		int a=1;
		int sum = 0;
		while(a<=100) {
			a++;
			if((a%2==0)&&(a%7==0)) {
				sum+=a;
			}
		
		}
		System.out.println(sum);
	}

}
