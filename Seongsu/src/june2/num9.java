package june2;

import java.util.Scanner;

class Profile{
private String name,sub;
Profile(String name, String sub){
this.name=name;
this.sub=sub;}
String getname(){ return name;}
String getsub(){ return sub;}
}
public class num9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String sub = sc.next();
		String na = sc.next();
		String su = sc.next();
		Profile p1 = new Profile(name,sub);
		Profile p2 = new Profile(na,su);
		
		
		System.out.println(p1.getname()+" "+p1.getsub());
		System.out.println(p2.getname()+" "+p2.getsub());
		

	}

}
