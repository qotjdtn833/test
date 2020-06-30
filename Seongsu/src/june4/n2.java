package june4;

public class n2 {

	public static void main(String[] args) {
		int aa[] = new int[10];
		int c=0;
		int sum=0;
		
		for(int i = 0; i<aa.length; i++) {
			aa[i]=(int)(Math.random()*9)+1;
			System.out.print(aa[i]+" \n");
			sum+=aa[i];
		}
		System.out.println("Æò±Õ°ªÀº"+sum/10);
	}

}
