package june3;
class Person{
	long id;
	String name;
	Person(long id, String name){
		this.id=id;
		this.name=name;
	}	
}

class Employee extends Person{
	int salary;
	Employee(long id, String name, int salary){
		super(id, name);
		this.salary=salary;
	}
public String toString() {
	return salary + " " + id + " " + name; // 중간에 공간줘야함
}
}
public class n5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e =new Employee(10000, 11, b);
		System.out.println(e);
	}

}
