package pk26;

import java.util.Comparator;

public class Member implements Comparator<Member> {
	
	private int memberId;
	private String memberName;
	private Member() {} // 디폴트 생성자 (Comparator <Member>)
	public Member(int memberId, String memberName) { //생성자
		this.memberId=memberId;
		this.memberName=memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberId+"님의 이름은"+memberName;
	}

	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member) {  //객체여부확인
			Member member = (Member)obj;  //다운캐스팅
			return true;
		}
		else {
			return false;
		}
	}


	@Override
	public int compare(Member member1, Member member2) {
		// TODO Auto-generated method stub
		return (member1.memberId-member2.memberId); //오름차순
	}
	
	
	
	
}
