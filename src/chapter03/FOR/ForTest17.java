package chapter03.FOR;

import java.util.Scanner;

public class ForTest17 {

	public static void main(String[] args) {
		// 정수를 입력받아서 입력된 수만큼 ★ 출력 
		
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		
		int i,j,k;
		int n=scan.nextInt();
		
		/*
		for(i=0;i<n;i++) {
			System.out.print(" ");
			for(k=0;k<=i;k++) {
			System.out.print("★");
		}
		System.out.println();
		}
		*/
		
		for( i=0; i<n; i++)
		{
			for( j=0; j<=n-1-i; j++)
			{
				System.out.print(" ");
			}
			for( j=0; j<2*i+1; j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
	}

}
