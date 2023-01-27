package chapter02;

public class Logic_Test03 {

	public static void main(String[] args) {
		
		int num1=10;
		int i=2;
		
		boolean value=((i=i+2)<10) && ((num1=num1+2)<10);
		System.out.println(i);  //4
		System.out.println(num1);  //12
		System.out.println(value); //false
		
		System.out.println("-------------------");
		
		value=((i=i+2)<10) || ((num1=num1+2)<10);  //앞이 true일 때 어차피 true라 뒤는 판단 안해서 연산도 안함
		System.out.println(i);  //6
		System.out.println(num1);  //12
		System.out.println(value); //true
		
	}

}
