package chapter02;

public class AssignTest03 {

	public static void main(String[] args) {

		int num1=10;
		int num2=20;
		
		System.out.println(+num1);
		System.out.println(-num2);  //음수로 표시만(실제로 num2가 -20값은 아님)
		System.out.println(num2);
		
		num2= -num2;
		System.out.println(num2);
		
	}
}
