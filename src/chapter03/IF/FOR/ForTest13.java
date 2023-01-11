package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest13 {

	public static void main(String[] args) {
		// 구구단
		/*
		for(int i=2;i<10;i++ ) {
			for (int j=1;j<10;j++) {  //i=2 j=1~9 | 
				System.out.println(i+"x" +j+ "="+(i*j));		
			}//in for
			System.out.println("---------------");
		}//out for
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		int a=scan.nextInt();
		for (int k=1;k<10;k++) {
			System.out.println(a+"x"+k+ "="+(a*k));
		}
		
		
	}//main
	
}//class
