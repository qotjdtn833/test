package june3;
abstract class Odd{
	   protected int n;
	   public Odd(int n){
	this.n=n;
	   }
	   public abstract boolean is( ); //Ȧ���̸� true ����
	}
	 class B extends Odd{
	   public B(int n){
	     super(n);
	}
	   boolean is() {
		   if(n%2==0) {
			   return false;
		   }
		   return true;
	   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B(10);
		System.out.println(b.is( )); //B�� ¦���̹Ƿ� false���� 

	}

}
