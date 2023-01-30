package chapter01;

public class Constant {

	public static void main(String[] args) {
		//상수 : 변하지 않는 값 / 상수 아닌건 선언 없이 값 변경 가능(또 선언은 X)
		
		final int MAX_NUM=100;
		final int MIN_NUM;  //초기화값이 없음
		final double PI=3.14;
		
		MIN_NUM=0;
				
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		System.out.println(PI);
	
	}

}
