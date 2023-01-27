package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int num,cnt=0,sum=0;
		double avg;
		// 0을 입력하면 종료
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			num=scan.nextInt();
			if(num==0) {
				break;
			} else {
				cnt++;
				sum += num;
			}
		}
		System.out.println("입력된 자료의 개수 : "+cnt);
		System.out.println("입력된 자료의 합계 : "+sum);
		System.out.println("입력된 자료의 평균 : "+(sum/cnt));
		System.out.println("프로그램 종료");
	}

}
