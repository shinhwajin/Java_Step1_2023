package chapter06;

import java.util.Scanner;

public class GuguDanMain {

	public static void main(String[] args) {
		
		GuguDan gd=new GuguDan();
		
		int num;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("출력할 단을 입력하세요 : ");
		num=scan.nextInt();
		
		gd.showTable(num);
		
	}

}
