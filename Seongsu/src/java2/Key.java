package java2;

public class Key {

		public int number;
		
		public Key(int number) {
			this.number=number;
		}

		@Override
		public boolean equals(Object obj) {
			// 부모 객체와 자식객체가 형성되어서 형변환이 가능한지 판단
			if(obj instanceof Key) {
				//다운캐스팅으로  obj가 key클라스와 comparekey로 대입
				Key compareKey = (Key) obj;
				//this의 number와 comparekey의 number 같으면 true 아니면 false
				if(this.number ==Key.number) {
					return true;
				}
				else {
					return false;
				}
			}
		}

		@Override
		public int hashCode() {
			return number;
		

}
