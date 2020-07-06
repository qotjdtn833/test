package pk26;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Serviet/JSP");
		list.add("DATABASE");
		list.add("Spring");
		
		// 총 객체수
		System.out.println(list.size());
		
		
		//for  -> size, get 사용
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+"번 index : "+list.get(i));
		}

		//삭제
		list.remove("JDBC"); // object(객체를 바로 사용)하여 지울 수 있음. 2개정도 지우기
		list.remove(3);
	
		System.out.println("========After Remove=======");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+"번 index : "+list.get(i));
		}

	}

}
