package pk26;

import java.util.List;
import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		
		//����Ʈ������ ���� ArrayListŬ������ ��ü����
		List<String> ls = new ArrayList<String>();
		
		//���� ����Ʈ�� ������ �߰�
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
