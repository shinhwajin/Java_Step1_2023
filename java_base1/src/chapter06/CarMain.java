package chapter06;

import javax.swing.JOptionPane;

public class CarMain {

	public static void main(String[] args) {
		//객체생성
		Car myCar=new Car();
		
		System.out.println("제작회사 : "+myCar.company);
		System.out.println("모델명 : "+myCar.model);
		System.out.println("색깔 : "+myCar.color);
		System.out.println("최고속도 : "+myCar.maxSpeed);
		System.out.println("현재속도 : "+myCar.speed);
		System.out.println("-------------------------");
		myCar.speed=Integer.parseInt(JOptionPane.showInputDialog("현재속도"));
		System.out.println("변경된 현재속도 : "+myCar.speed);

	}

}
