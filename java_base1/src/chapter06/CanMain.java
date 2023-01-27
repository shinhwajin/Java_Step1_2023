package chapter06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {

		CanVending ven=new CanVending();
		ven.init();  //음료준비
		
		Scanner scan=new Scanner(System.in);
		System.out.print("돈을 투입하세요 : ");
		int money=scan.nextInt();
		ven.showCans(money);
		
		System.out.println("-----------------");
		System.out.print("음료를 선택하세요 : ");
		String select=scan.next();
		ven.outCan(select);
		
	}

}
