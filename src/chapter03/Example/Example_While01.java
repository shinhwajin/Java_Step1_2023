package chapter03.Example;

import java.util.Scanner;

public class Example_While01 {

	public static void main(String[] args) {

		boolean run=true;
		
		int balance=0;
		
		Scanner scan=new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.print("-----------------------------\n선택> ");
			int num=scan.nextInt();
			
			switch (num) {
			case 1:
				System.out.print("예금액> ");
				int i=scan.nextInt();
				balance += i;
				break;
			case 2:
				System.out.print("출금액> ");
				int j=scan.nextInt();
				balance -= j;
				break;
			case 3: 
				System.out.print("잔고> ");
				System.out.println(balance);
				break;
			case 4: 
				System.out.println("\n프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}//switch
			
			if(num==4) {
				run=false;
			}//if

			System.out.println();
		}//while
		

	}

}
