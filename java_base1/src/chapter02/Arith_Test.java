package chapter02;

public class Arith_Test {

	public static void main(String[] args) {
		//총점과 평균 출력
		
		int mathScore1=93;
		int engScore1=87;
		
		//총점
		int totScore1 = mathScore1+engScore1;
		System.out.println("총점 : "+totScore1);
		
		//평균
		int avScore1 = totScore1/2;
		System.out.println("평균 : "+avScore1);
		
		
		
		int mathScore2=96;
		int engScore2=87;
		
		//총점
		double totScore2 = mathScore2+engScore2;
		System.out.println("총점 : "+totScore2);
		
		//평균
		double avScore2 = totScore2/2;
		System.out.println("평균 : "+avScore2);

	}
}
