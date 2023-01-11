package chapter03.IF;

import java.util.Scanner;

public class If_Example11 {

	public static void main(String[] args) {
		//Scanner scan이라는 인스턴스 변수 선언
		Scanner scan=new Scanner(System.in);
		
		//ID라는 변수로 아이디 받기
		System.out.print("아이디 : ");
		String ID=scan.nextLine();
		
		//PW라는 변수로 비밀번호 받기(String) => 숫자로 받되 String
		System.out.print("비밀번호 : ");
		String PW=scan.nextLine();
		//int형으로 형변환
		int pass=Integer.parseInt(PW); 
		
		/*
		//중접질의를 사용하여 "로그인 성공"과 "비밀번호 다름", "아이디 없음"
		if (ID.equals("hwajin")) {
			if (pass == 123456) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호 다름");
			}
		} else {
			System.out.println("아이디 없음");
		}
		*/
		
		//논리 연산자
		if (ID.equals("hwajin") && pass == 123456) {
			System.out.println("로그인 성공");
		} else
			System.out.println("로그인 실패");
		
		
	}//main

}//class
