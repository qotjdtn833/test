package june5;
class Total{
	int sum;
	Total(){ // �⺻ ������!!!!
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
	// ���� ��� (total, run()�޼ҵ� �������̵�)
	int a, b;
	Adds(int a, int b){
		this.a=a;
		this.b=b;
	}
	public void run() {
		for(int i=a; i<b; i++) {
			add(i); // �θ��� �Լ��� ��밡��
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
			t1.join(); // �ش� �����尡 ���� �� ������
			t2.join();}
			
			catch(Exception e) {}
		System.out.println(a1.get()+" "+a2.get());
		
		
		//runnable�κ��� ��ӹ��� Ŭ�����κ��ʹ� start�Լ��� ����
		//thread Ŭ�����κ��� ��ü�� �ٽû����ؼ� start �Լ��� ����Ͽ�����

	}

}
