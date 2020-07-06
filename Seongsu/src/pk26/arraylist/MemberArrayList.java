package pk26.arraylist;
import java.util.ArrayList;
import java.util.Iterator;

import pk26.Member;

public class MemberArrayList {

	
		private ArrayList<Member> arrayList; //ArrayList ����
		
		public MemberArrayList() {
			arrayList=new ArrayList<Member>(); //����� ������ ArrayList�� �ν��Ͻ�ȭ ��		
			}
		
		public void addMember(Member member) { //ArrayList�� ��� �߰�
			arrayList.add(member);
		}
		
		public boolean removeMember(int memberId) { //������̵� �Ű�������, �������θ�
			for(int i=0; i<arrayList.size(); i++) { // �ش� ���̵� ���� ����� arraylist
				Member member = arrayList.get(i);  
				int tempId=member.getMemberId();
				if(tempId==memberId) {				//������̵� �Ű������� ��ġ�ϸ�
					arrayList.remove(i);			// �ش� ����� ����
					return true;					// true ��ȯ
				}
			}
			
			Iterator<Member> ir = arrayList.iterator();
			while(ir.hasNext()) { //ir ������ ���� �����Ͱ� ���������� �ݺ�
				Member member = ir.next();
				int tempId = member.getMemberId();
				if(tempId == memberId) {		//������̵� �Ű������� ��ġ�ϸ�
					arrayList.remove(member);	// �ش� ����� ����
					return true;				// Ʈ�� ��ȯ
				}
			}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
		
		}

		public void showAllMember() {
			for(Member member : arrayList) {
				System.out.println(member);
			}
			System.out.println();
		
		
		}
}
