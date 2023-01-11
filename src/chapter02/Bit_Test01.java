package chapter02;

public class Bit_Test01 {

	public static void main(String[] args) {
		// Bit 연산
		
		int num1=5;  //0101
		int num2=10; //1010
		
		
		// Bit OR(|)
		int result=num1 | num2;  //1111
		System.out.println(result);
		
		// Bit AND(&)
		result=num1 & num2;  //0000
		System.out.println(result);
		
		// Bit XOR(^) : 서로 다를 경우 1 / 같을 경우 0
		result=num1 ^ num2;  //1111
		System.out.println(result);
		
		//~ : 0/1 반대로
				
	}

}
