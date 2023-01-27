package chapter06;

public class GuguDan {
	
	//멤버변수
	
	//생성자 생략
	
	//메소드
	public void showTable(int num) {
		
		System.out.println(num+"단");
		for(int i=0;i<=9;i++) {
			System.out.println(num+"x"+i+" = "+(num*i));
			
		}//for
		
	}
	
}
