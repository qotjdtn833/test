package june4;


public class n7 {
	static int same(int a[], int b[]) {
		int num =0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
					num++;
				}
			}
		}
			return num;
	}
	public static void main(String[] args) {
		int lotto[] = {4, 10, 25, 30, 45, 47};
		int my[] = {1, 4, 7, 26, 45, 48};
		int r;

		r= same(lotto, my);
		System.out.printf("일치하는번호의개수: %d\n", r); }

	}


