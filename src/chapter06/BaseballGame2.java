package chapter06;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame2 {
	//멤버변수
	private int[] num=new int[3];
	private String result;
	
	Scanner scan = new Scanner(System.in);
	
	//생성자
	public BaseballGame2() {
		int[] numberPool=new int[9];
		outer: for(int i=0;i<3;) {
			num[i]=new Random().nextInt(9)+1;
			//중복값 제거하는 반복문
			for(int j=0;j<i;j++) {
				if(num[j]==num[i]) {
					continue outer;
				}
			}//for
			i++;
		}
	}
	
	public String check() {
		result="OUT";
		int[] myNum= new int[3];
		int strike=0;
		int ball=0;
		
		System.out.println();
		System.out.println("1 ~ 9 사이의 수를 입력하세요");
		String[] numStr= {"첫","두","세"};
		for(int i=0;i<3;i++) {
			do {
				System.out.print(numStr[i]+"번째 수를 입력하세요 > ");
				myNum[i]=scan.nextInt();
				if(myNum[i]>9||myNum[i]<1) {
					System.out.println("1 ~ 9 사이의 수를 입력하세요");

				}
			} while(myNum[i]>9||myNum[i]<1);
		}
		if(strike==3) {
			result="WIN";
		} else if(strike+ball!=0) {
			System.out.println(strike + "Strike " + ball + "Ball!!");
		} else {
			System.out.println("OUT!!");
			System.out.println("===============================");
		}
		return result;
	}
		
	
}
