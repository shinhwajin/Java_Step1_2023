package chapter02;

public class Assignment {

	public static void main(String[] args) {
		/*
		Q1 바이트 크기가 작은 자료형을 더 큰 자료형으로 대입하는 자동 형 변환의 코드 2가지 구현

		Q2 실수를 정수형 변수에 대입하는 경우에 형변환이 자동으로 이루어지고 소수점 이하 부분이
		없어지는 형변환 코드 2가지 구현

		Q3 더 많은 실수를 표현하기 위해서 가수부와 지수부로 비트를 나누어 표현한 방식
		(  ) 

		Q4 변수 두개를 선언해서 10과 2.5을 대입하고 두 변수의 사칙 연산 결과를 정수로만 출력

		Q5 '글'이라는 한글 문자의 유니코드 값을 찾아서 char형으로 선언한 변수에 저장한 뒤 
		그 변수를 출력
		 */
		
		//Q1
		byte b1=30;
		int i1=b1;
		
		System.out.println("===Q1===");
		System.out.println("byte->int : "+i1);
		
		
		byte b2=20;
		long l1=b2;
		
		System.out.println("byte->long : "+l1);
		
		//Q2
		float f1=2.34f;
		int i3=(int)f1;
		
		System.out.println("===Q2===");
		System.out.println("float : "+f1);
		System.out.println("float ->int :"+i3);
		
		
		int i4=50;
		float f2=3.5f;
		
		System.out.println(" ");
		System.out.println("int : "+i4);
		System.out.println("float : "+f2);
		System.out.println("int+float = "+(i4+f2));
		
		//Q3
		System.out.println("===Q3===");
		System.out.println("부동형소수점방식");
		
		//Q4
		int i5=10;
		float f3=2.5f;
		
		System.out.println("===Q4===");
		System.out.println("int : "+i5);
		System.out.println("float : "+f3);
		System.out.println("int+float = "+(int)(i5+f3));
		System.out.println("int-float = "+(int)(i5-f3));
		System.out.println("int*float = "+(int)(i5*f3));
		System.out.println("int/float = "+(int)(i5/f3));
		
		//Q5
		char c='\uAE00';
		
		System.out.println("===Q5===");
		System.out.println(c);
		
		
	}

}
