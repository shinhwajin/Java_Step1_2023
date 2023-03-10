package chapter06;

public class TSubway {

	//멤버
	public String lineNumber;
	int passengerCount;
	int money;  //지하철 수입
	
	//디폴트 생성자 생략
	
	public TSubway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	public void take(int money) {  //승객이 낸 돈
		this.money += money;  //지하철의 수입 증가
		passengerCount++;  //승객 수
	}
	
	public void showInfo() {  //지하철의 정보 출력
		System.out.println("지하철 "+lineNumber+"의 승객은 "+passengerCount+"명이고, 수입은 "+money+"원입니다.");
	}
	
}
