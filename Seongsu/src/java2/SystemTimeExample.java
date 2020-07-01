package java2;

public class SystemTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1=System.nanoTime();
		
		int sum=0;
		for(int i=1;i<10000000;i++) {
			sum+=1;
		}
		long time2=System.nanoTime();
		
		System.out.println("1~10000000까지의 합 :"+sum);
		System.out.println("계산에"+(time2-time1));
	}
	
}
