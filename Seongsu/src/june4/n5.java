package june4;
class Food{
	 int price=10000; String menu;
	Food(String menu){
		this.menu=menu;
	}
	public String toString() {
		return menu+" ";
	}
}
public class n5 {

	public static void main(String[] args) {
		Food f =  new Food("�ұ���");
		System.out.println(f+"" +f.price+ "��");  //�ұ��� 10000��


	}

}
