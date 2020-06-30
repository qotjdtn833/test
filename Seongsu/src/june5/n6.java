package june5;

import java.util.Scanner;

public class n6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];
		int max, min, sum=0;
		double avg;
		int maxidx = 0;
		int minidx = 0;
		
		for(int i=0; i<score.length; i++) {
			score[i]=sc.nextInt();
		}
		max=min=score[0];
		for(int i=0; i<score.length; i++) {
			if(max<score[i]) {
				max=score[i];
				maxidx=i; // 최고점의 위치를 저장
			}
			if(min>score[i]) {
				min=score[i];
				minidx=i;
			}
		}
		System.out.print("유효점수 : ");
		
		for(int j= 0; j <score.length; j++ ) {
			if(j==maxidx || j==minidx) {
				continue;
			}
			else {
			sum+=score[j];
			}
			System.out.println(score[j]);
		}
		System.out.println("평균 : "+ sum/3.0);
		}
		
		
		

	}


