package chapter02;

public class Condition01 {

	public static void main(String[] args) {
		//삼항연산자
		
		int a=10;
		int b=15;
		boolean result;
		
		result= ++a >= b ? true : false; // ? 앞 문장 판단, true시 실행 : false시 실행
		System.out.println(result);
		
		//
		
		int n1=10;
		int n2=20;
		char result2;
		
		result2= (++n1 == n2) ? 'Y' : 'N';
		System.out.println(result2);
		
	}

}
