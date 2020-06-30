package june2;
interface Animal{
void show();

}
class Cat implements Animal{
	public void show() {
		System.out.println("고양이");
	}
}
class Dog implements Animal{
	public void show() {
		System.out.println("강아지");
	}
}

public class n7 {
	public static void main(String[] args) {
		Animal cat=new Cat(); 
		cat.show(); //“고양이” 출력
		Animal dog=new Dog(); 
		dog.show(); 
		} //“강아지” 출력


	}


