package java2;

public class ExitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i==5) {
				//System.exit(i);
				break; //for문 종료
			}
		}
		System.out.println("프로젝트 종료");
	}

}
