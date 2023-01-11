package chapter03.IF;

public class If_Example06 {

	public static void main(String[] args) {

		int num=(int)(Math.random()*6)+1;  //0부터 6전까지 랜덤, +1 -> 1부터 / Math.random() 기본: double
		
		System.out.println(num);
		
		//1점~6점까지 받을 수 있고 점수 별 분식
		if (num==1) {
			System.out.println("1점 -> 순대");
		} else if (num==2) {
			System.out.println("2점 -> 튀김");
		} else if (num==3) {
			System.out.println("3점 -> 김밥");
		} else if (num==4) {
			System.out.println("4점 -> 쫄면");
		} else if (num==5) {
			System.out.println("5점 -> 어묵");
		} else if (num==6) {
			System.out.println("6점 -> 라면");
		}
		
		
	}//main

}//class
