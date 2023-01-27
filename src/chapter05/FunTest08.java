package chapter05;

public class FunTest08 {
	
	//멤버변수(필드)
	
	//디폴트 생성자
	
	//메소드 : 재귀함수
	
	public static int Recur(int a) {
		
		int result;
		System.out.print(a+" ");
		
		if(a==1) {
			return(1);  //=break;
		} else {
			result=a*Recur(a-1);       //a=5, a=4로 돌린거 곱함 / a=4, a=3로 돌린거 곱함 / => 5*4*3*2 , 1일때 return(1)로 오류없이 끝남
		}
		
		//통상적 표기
		//return (1);  //정상종료는 아니지만 오류없이 끝남
		//return 0;  //정상종료되었지만 넘어값?이 없음
		return result;
	}

	public static void main(String[] args) {
		int x=5;
		System.out.println("메소드 호출");
		int res=Recur(x);
		System.out.println();
		System.out.println("1 ~ "+x+"까지의 수를 곱한 값 : "+res);
	}

}
