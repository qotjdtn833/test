package june2;
interface Animal{
void show();

}
class Cat implements Animal{
	public void show() {
		System.out.println("�����");
	}
}
class Dog implements Animal{
	public void show() {
		System.out.println("������");
	}
}

public class n7 {
	public static void main(String[] args) {
		Animal cat=new Cat(); 
		cat.show(); //������̡� ���
		Animal dog=new Dog(); 
		dog.show(); 
		} //���������� ���


	}


