package chapter04;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TowDimension02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int JavaScore[][]=new int[2][3];

		
/*
		for(int i=0;i<JavaScore.length;i++) {
			for(int j=0;j<JavaScore[i].length;j++) {
				System.out.print("점수 입력 : ");
				JavaScore[i][j]=scan.nextInt();
			}//for
		}//for
		
		for(int i=0;i<JavaScore.length;i++){
			for(int j=0;j<JavaScore[i].length;j++) {
				System.out.print(JavaScore[i][j]+" ");
			}
			System.out.println();
		}
*/
		
	
		for(int i=0;i<JavaScore.length;i++) {
			for(int j=0;j<JavaScore[i].length;j++) {
				JavaScore[i][j]=Integer.parseInt(JOptionPane.showInputDialog("점  수"));
				System.out.print(JavaScore[i][j]+" ");
			}
			System.out.println();
		}
		//System.out.println(Arrays.deepToString(JavaScore));
	
		
				}
			
	}


