package days2;

public class random {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+1;
		String clock;
		if(time==1) {
			clock = "���ɽð�";
		}
		else if((time>=2)&&(time<=3)) {
			clock = "���νð�";
		}
		else {
			clock = "��ٽð�";
		}

		System.out.println(clock);
	}

}
