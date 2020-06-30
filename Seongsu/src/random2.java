
public class random2 {

	public static void main(String[] args) {
	int n = (int)(Math.random()*20)+81;
	//0.2*20+81 <= Math.random() < 1.0*20+81

	
		String grade;
		if(n>=90) {
			if(n>=95 ) {
				grade = "A+";
			}
			else { 
				grade = "A";
			}
		}
			else {
				if(n>=85 ) {
					grade = "B+";
				}
				else { 
					grade = "B";
				}
		}
	System.out.println(grade);
		}
		

}
