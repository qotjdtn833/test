import java.util.Scanner;

public class doubleif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이가 몇살 이신가요?");
		int age = sc.nextInt();
		System.out.println("키가 얼마나 되시나요?");
		int ki = sc.nextInt();
		char size;
		
		if(age>=20) {
			if(ki>=170) {
				size= 'L';
			}
			else if((ki>=160)&&(ki<170)) {
				size= 'M';
			}
			else {
				size= 'S';
			}
		}
		else {
			if(ki>=175) {
				size= 'L';
			}
			else if((ki>=165)&&(ki<175)) {
				size= 'M';
			}
			else {
				size= 'S';
			}
			
		}
		System.out.println("사이즈는 "+size);
	}
	

}
