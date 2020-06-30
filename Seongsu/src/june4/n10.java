package june4;

public class n10 {
	//역순으로 출력하는 함수
	public static void main(String[] args) {
		int ary[] = new int[] {6,2,8,4,9};
		int tmp;
		for(int i=0; i<4; i++) { 
			for(int j=i+1;j<5;j++) { 
				
					tmp=ary[i]; 
					ary[i]=ary[j]; 
					ary[j]=tmp;
				
			}
		}
		for(int i=0; i<5;i++) {
			System.out.print(ary[i]+" ");
		}
	}

}
