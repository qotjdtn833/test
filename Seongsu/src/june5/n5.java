package june5;
class Total{
	int sum;
	Total(){ // 기본 생성자!!!!
		sum=0;
	}
	int get() {
		return sum;
	}
	void add(int n) {
		sum+=n;
	}
}
class Adds extends Total implements Runnable{
	// 다중 상속 (total, run()메소드 오버라이딩)
	int a, b;
	Adds(int a, int b){
		this.a=a;
		this.b=b;
	}
	public void run() {
		for(int i=a; i<b; i++) {
			add(i); // 부모의 함수를 사용가능
		}
	}
}
public class n5 {

	public static void main(String[] args) {
		Adds a1 = new Adds(1,10);
		Adds a2 = new Adds (11,20);
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a2);
		t1.start();
		t2.start();
		
		try {
			t1.join(); // 해당 스레드가 종료 될 때까지
			t2.join();}
			
			catch(Exception e) {}
		System.out.println(a1.get()+" "+a2.get());
		
		
		//runnable로부터 상속받은 클래스로부터는 start함수는 못씀
		//thread 클래스로부터 객체를 다시생성해서 start 함수를 사용하여야함

	}

}
