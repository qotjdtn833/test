package java702;

public class StbuffertTest {

	public static void main(String[] args) {

	
		StringBuffer buf=new StringBuffer("Nice Day");
		System.out.println(buf.toString()); // �̹� �����ǰ� �Ǿ�����
		System.out.println(buf.length());
		System.out.println(buf.capacity());
		
		buf.ensureCapacity(100);  //�뷮 ������Ű�� 
		System.out.println(buf.capacity());
		buf.insert(0, "HI! ");
		buf.insert(12, " Everybody^��^");
		System.out.println(buf.toString()); 
		
		buf.delete(0, 3);
		System.out.println(buf.toString()); 
		
	}

}
