
public class case4 {

	public static void main(String[] args) {
		int n= (int)(Math.random()*1000)+1;
		//1~6 정수 중 무작위수
		
		
		if((n>=1)&&(n<=12)) {
			System.out.println("레전더리 등급업");
			
		}
		else if((n>=13)&&(n<=48)) {
			System.out.println("유니크 등급업");
		
		}
		else {
				System.out.println("실패");
			}
		}
	}


