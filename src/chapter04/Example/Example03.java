package chapter04.Example;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		// 학생 수를 입력받아, 점수를 입력하고 점수리스트를 출력하고 총점과 평균을 구하는 프로젝트
		
		Scanner scan=new Scanner(System.in);
		
		int[] score= {};    //=int[] score=null;
		boolean run=true;
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");
			int a=scan.nextInt();
			
			if (a==1) {
				System.out.print("학생수 > ");
				int student=scan.nextInt();
				score=new int[student];      //new int가 배열 초기화라 if 밖으로 빠지면 a=1 아니어도 초기화됨 -> a=2일 때는 실행되면 안되니까 a=1 if 안으로.
			} else if (a==2) {
				for(int i=0;i<score.length;i++) {
					System.out.print("score["+(i+1)+"] > ");
					score[i]=scan.nextInt();
				}
			} else if (a==3) {
				for(int i=0;i<score.length;i++) {
					System.out.println("score["+(i+1)+"] : "+score[i]);
				}
			} else if (a==4) {
				int max=0;
				int total=0;
				for (int i=0;i<score.length;i++) {
					if (score[i]>max){      //max=max<score[i]? score[i]:max;
						max=score[i];       //
					}                       //
					total += score[i];
				}
				double avg=total/(double)score.length;
				System.out.println("최고 점수 > "+max);
				System.out.println("총점 > "+total);
				System.out.println("평균 > "+avg);
			} else if (a==5) {
				run=false;
			} else {
				System.out.println("번호를 다시 입력하세요.");
			}
		}//while
			System.out.println("프로그램 종료");


			
	}//main
}//class


