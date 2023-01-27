package chapter06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int select;
		String check;

		// 객체생성
		Start s = new Start();

		while (true) {

			System.out.print("수 입력 : ");
			select = scan.nextInt();
			check = s.check(select);
			if (check == "SUCCESS") {
				break;
			}
			
		} // while
		
		
/*		do {
			System.out.print("숫자 입력 : ");
			select = scan.nextInt();
		} while (s.check(select).equals("FAIL"));	*/	
	}
}
