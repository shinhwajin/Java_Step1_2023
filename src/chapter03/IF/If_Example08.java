package chapter03.IF;

import javax.swing.JOptionPane;

public class If_Example08 {

	public static void main(String[] args) {
		
		int num1,num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("첫번째 숫자를 입력하세요."));
		num2=Integer.parseInt(JOptionPane.showInputDialog("두번째 숫자를 입력하세요."));
		
		System.out.println("첫번째 입력받은 수 (num1) : "+ num1);
		System.out.println("두번째 입력받은 수 (num2) : "+ num2);
		
		//num1이 크면 "num1이 큽니다."
		//num2가 크면 "num2가 큽니다."
		//그 밖에는 "두 수는 같습니다."
		
		if (num1>num2) {
			System.out.println("num1이 큽니다.");
		} else if (num1<num2) {
			System.out.println("num2가 큽니다.");
		} else {
			System.out.println("두 수는 같습니다.");
		}
		
		
	}

}
