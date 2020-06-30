package days2;

public class random {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+1;
		String clock;
		if(time==1) {
			clock = "점심시간";
		}
		else if((time>=2)&&(time<=3)) {
			clock = "공부시간";
		}
		else {
			clock = "퇴근시간";
		}

		System.out.println(clock);
	}

}
