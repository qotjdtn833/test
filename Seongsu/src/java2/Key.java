package java2;

public class Key {

		public int number;
		
		public Key(int number) {
			this.number=number;
		}

		@Override
		public boolean equals(Object obj) {
			// �θ� ��ü�� �ڽİ�ü�� �����Ǿ ����ȯ�� �������� �Ǵ�
			if(obj instanceof Key) {
				//�ٿ�ĳ��������  obj�� keyŬ�󽺿� comparekey�� ����
				Key compareKey = (Key) obj;
				//this�� number�� comparekey�� number ������ true �ƴϸ� false
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
