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
				maxidx=i; // �ְ����� ��ġ�� ����
			}
			if(min>score[i]) {
				min=score[i];
				minidx=i;
			}
		}
		System.out.print("��ȿ���� : ");
		
		for(int j= 0; j <score.length; j++ ) {
			if(j==maxidx || j==minidx) {
				continue;
			}
			else {
			sum+=score[j];
			}
			System.out.println(score[j]);
		}
		System.out.println("��� : "+ sum/3.0);
		}
		
		
		

	}


