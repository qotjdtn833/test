package pk24;

public class ThreeDPrinterTest {
	
	public static void main(String[] args) {
		
		ThreeDPrinterTest printer = new ThreeDPrinterTest();
		
		Powder p1 = new Powder();
		printer.setMaterial(p1);
		//�ٿ�ĳ����
		Powder p2 = (Powder)printer.getMaterial();
	}
}
