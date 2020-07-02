package pk24;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		 GenericPrinter<Powder> powderPrint=new GenericPrinter<Powder>();
		 powderPrint.setMaterial(new Powder());
		 Powder powder=powderPrint.getMaterial();
		 System.out.println(powderPrint);
		 System.out.println(powder);
		 
		 GenericPrinter<Plastic> plasticPrinter=new GenericPrinter<Plastic>();
		 plasticPrinter.setMaterial(new Plastic());
		 Plastic plastic=plasticPrinter.getMaterial();
		 System.out.println(plasticPrinter);
		 System.out.println(plastic); 
		 
		 GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		 waterPrinter.setMaterial(new Water());
		 Water water=waterPrinter.getMaterial();
		 System.out.println(waterPrinter);
		 System.out.println(water);
		 
		 
	}

}
