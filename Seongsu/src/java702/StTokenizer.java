package java702;

import java.util.StringTokenizer;
public class StTokenizer {

	public static void main(String[] args) {
		
		String str = "Have a Nice Day";
		
		//StringTokenizer (�ڸ��� ���� ���ڿ�, �ڸ��� ���ع����� ����, �ڸ��±����� ������ ����)
		// str�� ��ū�� 4��
		StringTokenizer obj = new StringTokenizer(str, " ", false);
	
		//StringTokenizer.hasMoreToken()-Token�� ����Ǿ� �ִ� �迭
		while(obj.hasMoreTokens()) {
			String t = obj.nextToken(); 
			System.out.println(t);
		}
	}

}
