package chapter03.IF;

import java.util.Scanner;

public class If_Example07 {

	public static void main(String[] args) {
		
		//입력 Scanner 클래스 초기화 => 인스턴스 변수방 선언
		Scanner scan=new Scanner(System.in);  // 외부 클래스 Scanner 불러오면서 메모리 할당해줌 -> Scanner 불러온 게 scan에 대입
		System.out.print("1. 첫번째 수 : ");
		double num1=Double.parseDouble(scan.nextLine());   //java.lang꺼 만 (double)로 형변환 가능
		System.out.println("첫번째 입력받은 수 출력 : "+ num1);
		
		//num2
		System.out.print("2. 두번째 수 : ");
		double num2=Double.parseDouble(scan.nextLine());   //num2 는 스캔받은 문자를 double로 형변환한 값
		System.out.println("두번째 입력받은 수 출력 : "+ num2);

		
		/*
		if (num2 != 0.0) {
			System.out.println("나눈 값 : "+ num1/num2);
		} else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		*/
		
		if (num2 == 0.0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			System.out.println("나눈 값 : "+ num1/num2);
		}
		
	}//main

}//class
