package test1;

public class num4 {

	public static void main(String[] args) {
		int a= 1;
		int sum = 0;
		
		while(a<=100) {
			a++;
			if(a%5==0) {
				sum+=a;
			}
			
			
			
		}
		System.out.println(sum);
	}

}
