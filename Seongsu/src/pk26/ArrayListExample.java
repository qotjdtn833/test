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
		
		// �� ��ü��
		System.out.println(list.size());
		
		
		//for  -> size, get ���
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+"�� index : "+list.get(i));
		}

		//����
		list.remove("JDBC"); // object(��ü�� �ٷ� ���)�Ͽ� ���� �� ����. 2������ �����
		list.remove(3);
	
		System.out.println("========After Remove=======");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+"�� index : "+list.get(i));
		}

	}

}
