package chapter03.FOR;

public class ForTest04 {

	public static void main(String[] args) {
		
		//0 ~ 100까지의 수 중 홀수값만 합하기

		int num;
		int total=0;
		for (num=0;num<=100;num++) {
			//무시되는 수행문
			if(num%2==0)
				continue;  //그냥 무시하고 지나가기
		total += num;
		}
		
		System.out.println("0 ~ 100까지의 수 중 홀수값의 합 : "+total);
		System.out.println();
		System.out.println("1 ~ 20까지의 수 중 홀수값만 출력하시오");
		int i;
		for (i=1;i<=20;i++) {
			if (i%2==1)
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("1 ~ 20까지의 수 중 홀수값만 출력하시오");
		int j;
		for (j=1;j<=20;j++) {
			if (j%2!=0)
			System.out.print(j+" ");
		}
		
		
	}

}
