package june4;
import java.io.*;


public class n1 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
	InputStream in = null;
	OutputStream out = null;
	
	try {
		byte[]b=new byte[] {'1','2','3','4'};
		in=new ByteArrayInputStream(b);
		out=new FileOutputStream("d.txt");
		int r=-1;
		while((r=in.read())!=-1) {
			
		}
	}

}
}