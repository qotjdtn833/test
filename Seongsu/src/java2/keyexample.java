package java2;

import java.util.HashMap;

public class keyexample {

	public static void main(String[] args) {
		//Key ��ü�� �ĺ��ڷ� �Ͽ� String ���� �����ϴ� Hashmap ��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key,String>();
		
		// �ĺ�Ű(hashcode)�� put���� �Է�
		hashMap.put(new Key(1), "ȫ�浿");
		
		//�ĺ�Ű (
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
	

}
