package java2;

import java.util.HashMap;

public class keyexample {

	public static void main(String[] args) {
		//Key 객체를 식별자로 하여 String 값을 저장하는 Hashmap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key,String>();
		
		// 식별키(hashcode)에 put으로 입력
		hashMap.put(new Key(1), "홍길동");
		
		//식별키 (
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
	

}
