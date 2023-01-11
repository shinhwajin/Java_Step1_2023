package chapter07;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {

		int side;
		int height;
		int Area;
		
		side=Integer.parseInt(JOptionPane.showInputDialog("밑변"));
		height=Integer.parseInt(JOptionPane.showInputDialog("높이"));
		
		//객체생성
		Encapsulation obj=new Encapsulation();
		
		//Encapsulation의 메소드를 사용하여 사각형의 넒이 구하기
		Area=obj.Cal_Area(side, height);
		System.out.println("넓이 : "+Area);
		JOptionPane.showMessageDialog(null,"넓이 : "+Area);
	}

}
