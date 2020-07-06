package pk26;

import java.util.List;
import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		
		//리스트구조를 갖는 ArrayList클래스의 객체생성
		List<String> ls = new ArrayList<String>();
		
		//현재 리스트에 데이터 추가
		ls.add("hi!");
		ls.add(" Have");
		ls.add(" a Nice Day");
		
		for(int i=0; i<ls.size(); i++) {
			System.out.println(i+":"+ls.get(i).toString());
		}
		
		ls.add(3, "EveryBody");
		
		for(int i=0; i<ls.size(); i++) {
			System.out.println(i+":"+ls.get(i).toString());
		}
		
		ls.remove(0);
		
		for(int i=0; i<ls.size(); i++) {
			System.out.println(i+":"+ls.get(i).toString());
		}0
	
	}

}
