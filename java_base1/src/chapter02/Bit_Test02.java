package chapter02;

public class Bit_Test02 {

	public static void main(String[] args) {
		
		int num=0B00000101; //5
		System.out.println(num);
		
		System.out.println(num << 2);  //증가  ->00010100
		System.out.println(num >> 2);  //감소  ->00000001
		System.out.println("-----------");
		
		int a,b,c;
		a=5;
		b=2;
		c=a>>b;  // 감소  5>>2
		System.out.println(c);
		
		c=a<<b;  // 증가  5<<2
		System.out.println(c);

	}

}
