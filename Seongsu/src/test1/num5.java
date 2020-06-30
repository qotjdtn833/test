package test1;

public class num5 {

	public static void main(String[] args) {
		
		
		while(true) {
			int x = (int)((Math.random()*5)+1);
			int y = (int)((Math.random()*5)+1);
			System.out.println("x의 값은" + x);
			System.out.println("y의 값은" + y);
			if(x+y==5) {
				System.out.println("실행멈춤");
				break;
			}
			else {
				System.out.println("다시 리롤");
			}
		}
	}

}
