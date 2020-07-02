package pk24;
class MyArray<E>{
	private Object[] array= new Object[10];
	int i;
	
	public void add(<E> obj) {
		array[i++]=obj;
	}

	public E get(<E> index) {
		return array[index];
	}

	@Override
	public E toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}



}
public class GenericArray {

	public static void main(String[] args) {
		MyArray<String> myArray1 = new MyArray<String>();
		myArray1.add(new String("test"));
		String str=(String)myArray1.get(0); // 강제 형변환, get(0)은 0번지의 전체주소 
		System.out.println(str);
		
		MyArray<Integer> myArray2 = new MyArray<Integer>();
		myArray2.add(new Integer(100));
		Integer in=(Integer)myArray2.get(0); //강제 형변환
		System.out.println(in);

	}

}
