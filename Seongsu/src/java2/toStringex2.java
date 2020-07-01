package java2;
class Bk{
	int booknumber;
	String booktitle;
	
	Bk(int booknumber, String booktitle){
		this.booknumber=booknumber;
		this.booktitle=booktitle;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return booktitle + "," + booknumber;
	}


}

public class toStringex2 {

	public static void main(String[] args) {
		Bk book1 = new Bk(200, "°³¹Ì");
		System.out.println(book1);

	}

}
