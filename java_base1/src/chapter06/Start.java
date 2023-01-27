package chapter06;

import java.util.Random;
import java.util.Scanner;

public class Start {

	private int pcnum=new Random().nextInt(50)+1;  //외부에서 변경할 수 없게 private / 1~50 정수 중 추출
	private int count=0;
	private String result="FAIL";
	
	public String check(int mynumber) {  //함수 check의 결과값은 return result;
		count++;
		// random값보다 작으면 UP / 크면 DOWN / 일치하면 result=SUCCESS
		if (mynumber < pcnum) {
			System.out.println("UP!");
		} else if (mynumber > pcnum) {
			System.out.println("DOWN!");
		} else {
			System.out.println(count + "회 만에 정답!");
			result = "SUCCESS";
		}
		return result;
	}
	
}
