package chapter04.Example;

import java.util.Random;

import javax.swing.JOptionPane;

public class MyLotto {

	public static void main(String[] args) {
		
		int number;
		int cnt=0;
		int[] lotto=new int[6];

		System.out.println("==== 이번주 로또 예상번호 ====");
		number=Integer.parseInt(JOptionPane.showInputDialog("구매할 로또 개수를 입력하세요"));
		
		while(number>cnt) {
			System.out.print("["+(cnt+1)+"] : ");
			
/*			//중복되는 숫자 생각 안했을때
			for(int i=0;i<lotto.length;i++) {
				lotto[i]=new Random().nextInt(45)+1;
				System.out.print(lotto[i]+" ");
			}     */
			
/*			for(int i=0;i<lotto.length;i++) {
				System.out.print(((int)(Math.random()*45)+1)+" ");
			}     */

			
			
			outer : for(int i=0;i<lotto.length;) {
						lotto[i]=new Random().nextInt(45)+1;
			
			//중복값을 비교하는 반복문
							for(int j=0;j<i;j++) {
								if(lotto[i]==lotto[j]) {   //lotto[0] 은 비교대상 x / i=1,j=0 , lotto[1]은 lotto[0]과 같지 않으면 됨
												//i=2, j=0,j=1 ,  lotto[2]는 lotto[0]&lotto[1]과 	같지 않으면 됨
									continue outer;  // if 충족하면 outer 로 돌아감
								}//if
							}//in for
							System.out.print(lotto[i]+" ");
							i++;
					}//out for 
			
			
/*			for (int i=0 ; i < lotto.length; i++) {
				lotto[i]= (int)(Math.random()*(45)+1);
				System.out.print(lotto[i]+" ");
				for(int j=0;j<i;j++) {
					if(lotto[i]==lotto[j]) {
						i--;
					}
					System.out.print(lotto[i]+" ");
				}                             */
			
			cnt++;
			System.out.println();			
		
	
		}//while

	
	}
}
