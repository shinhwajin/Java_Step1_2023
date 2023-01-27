package chapter06;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 컴퓨터가 발생한 난수 1개
		int com1 = 0;
		int com2 = 0;
		int com3 = 0;

		do {
			// 1 ~ 9 난수 발생
			com1 = new Random().nextInt(9) + 1;
			com2 = new Random().nextInt(9) + 1;
			com3 = new Random().nextInt(9) + 1;
		} while (com1 == com2 || com1 == com3 || com2 == com3);  // 같은게 하나라도 있으면 다시

		// 컴퓨터 준비 완료

		// 사용자가 입력할 수
		int user1 = 0;
		int user2 = 0;
		int user3 = 0;

		while (true) {
			System.out.println("1 ~ 9 사이의 수를 입력하세요");
			System.out.print("첫번째 수를 입력하세요 : ");
			user1 = scan.nextInt(); // 사용자가 준비한 수
			System.out.print("두번째 수를 입력하세요 : ");
			user2 = scan.nextInt(); // 사용자가 준비한 수
			System.out.print("세번째 수를 입력하세요 : ");
			user3 = scan.nextInt(); // 사용자가 준비한 수

			int strike = 0;
			int ball = 0;

			// 만약 com1과 user1가 같으면 strike
			// user1가 com2나 com3와 같으면 ball

			if (user1 == com1) {
				strike++;
			} else if (user1 == com2 || user1 == com3) {
				ball++;
			}
			// ------------------------------------------
			if (user2 == com2) {
				strike++;
			} else if (user2 == com1 || user2 == com3) {
				ball++;
			}
			// ------------------------------------------
			if (user3 == com3) {
				strike++;
			} else if (user3 == com1 || user3 == com2) {
				ball++;
			}
			// ------------------------------------------
			if (strike == 3) {
				System.out.println("정답!! - " + com1 + com2 + com3);
				break;
			} else {
				if (strike > 0 || ball > 0) {
					System.out.println(strike + "Strike, " + ball + "Ball");
				} else { // 아무것도 일치하는 것이 없을 경우
					System.out.println("OUT!!");
					System.out.println("===============================");
				}
			}

		} // while

	}// main
}// class
