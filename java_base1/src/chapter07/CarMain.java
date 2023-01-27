package chapter07;

public class CarMain {

	public static void main(String[] args) {
		// 생성자를 통하여 초기화
		Car myCar = new Car("black", 50000);
		// 멤버변수 이용하여 하나씩 초기화
		//myCar.color="black";
		//myCar.cc=50000;

		// 멤버변수에 직접 접근해서 초기화 후 출력
		System.out.println("color : " + myCar.color);
		System.out.println("cc : " + myCar.cc);
		System.out.println("-----------------------------------------------");

		// 메소드를 이용한 출력
		System.out.println("color : " + myCar.getColor());
		System.out.println("cc : " + myCar.getCc());

	}

}
