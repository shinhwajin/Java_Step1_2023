package chapter05;

import javax.swing.JOptionPane;

public class FunTest01 {

	//합계 메소드(함수)
	//접근지정자 : public(공용:제한없음) / protected(패키지 내 사용) / private(클래스 내 사용)
	//void : return 없음
	public static void sum(int num1,int num2) {        //static: data영역에서 사용할 수 있게 해줌 // data(전역) / heap(ex.class) / stack(지역) 더 큰 영역으로 올리는게 new.
		//int num1=3;
		//int num2=5;
		int total=num1+num2;
		System.out.println(total);	
	}

	//실행 담당하는 메소드
	public static void main(String[] args) {
		
		int a, b;
		a=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("값2"));
			
		sum(a,b);
		
	}//main
	
	
/*	//메인을 기준으로 하며 메인선언 전 또는 후에 정의해도 됨
	public static void sum(int num1,int num2) {
		//int num1=3;
		//int num2=5;
		int total=num1+num2;
		System.out.println(total);	
*/
}
