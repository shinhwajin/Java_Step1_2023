package chapter03.FOR;

import java.util.Scanner;

public class ForTest09 {

	public static void main(String[] args) {
		// 몇명의 성적을 입력받을 것인지 정수로 인원수를 입력받고 총점과 평균을 구하시오. (단, 평균은 실수로 출력할 것)
		
		Scanner scan=new Scanner(System.in);
		int i, sum=0, cnt=0;
		double avg;
		
		System.out.print("몇명의 학생 점수를 입력받으시겠습니까? : ");
		int std=scan.nextInt();
		
		for (i=1;i<=std;i++) {
			System.out.print(i+"번째 학생의 점수를 입력해주세요. : ");
			int score=scan.nextInt();
			sum += score;
			cnt++;
		}
		avg=sum/(double)cnt;
		System.out.println();
		System.out.println(std+" 명의 총점 : "+sum+"점");
		System.out.println(std+" 명의 평균 : "+avg+"점");
		
	}

}
