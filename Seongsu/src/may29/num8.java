package may29;
class Multi{
	int a, b;
	Multi(int a, int b){
		this.a=a;
		this.b=b;
	}
	int mul(){
		return a*b;
	}
	}


public class num8 {

	public static void main(String[] args) {

		Multi m = new Multi(5,8);
		System.out.println(m.mul());
		//두 수 곱해서 출력

	}

}
