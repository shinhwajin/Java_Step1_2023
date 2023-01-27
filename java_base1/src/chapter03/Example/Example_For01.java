package chapter03.Example;

public class Example_For01 {

	public static void main(String[] args) {
		// 1 ~ 100까지의 수 중 3의 배수의 합
		
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				//System.out.print(i+" ");
				sum += i;
			}//if
		}//for
		
		//System.out.println();
		System.out.println("100 이하 3의 배수의 총합 : "+sum);
		
		
	}

}
