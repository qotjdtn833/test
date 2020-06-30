package june1;

import java.util.Scanner;

public class num6 {
		
	public static void main(String[] args) {
		
		int ary[] = new int[3];
		while(true) {
			for(int i =0; i<ary.length; i++) {
				ary[i]=(int)(Math.random()*5)+1;
				System.out.print(ary[i]+"");
			}
			System.out.println();
			if(ary[0]==ary[1] && ary[1]==ary[2]) {
				System.out.println("stop");
				break;
			}
		}
		
	}

}
