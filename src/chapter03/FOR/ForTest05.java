package chapter03.FOR;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		// 문제1 -> scanner 로 정수 입력받아 입력받은 정수부터 100까지의 합을 출력하시오
		
		Scanner scan=new Scanner(System.in);
	
		System.out.print("100 이하의 정수를 입력하세요 : ");
		int i=scan.nextInt();
		int num;
		int sum=0;
		
		for (num=i;num<=100;num++) {
			sum += num;
		}
		System.out.println(i+"부터 100까지의 합 : "+sum);
	
		// 문제2 -> 1부터 10까지 반복하면서 정수를 입력받아 그 수 중 짝수의 개수 출력
		// 단, 입력받은 수가 0이면 무시
		
		int j;
		int k=0;
		System.out.println("정수 10개를 입력하세요 ");
		for (j=1;j<=10;j++) {
			
			int num1=scan.nextInt();
			if (num1==0 || num1%2!=0)
				continue;
			else k++;
		}
		
		System.out.println("입력한 수 중 짝수의 개수 : "+k+"개");
		

	}

}
