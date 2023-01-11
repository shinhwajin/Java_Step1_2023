package chapter06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {

		int select;
		String check;

		// 객체생성
		Start s = new Start();

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("수 입력 : ");
			select = scan.nextInt();
			check = s.check(select);
			if (check == "SUCCESS") {
				break;
			}
		} // while


		Scanner scan = new Scanner(System.in);
		
/*		do {
			System.out.print("숫자 입력 : ");
			select = scan.nextInt();
		} while (s.check(select).equals("FAIL"));	*/	
	}
}
