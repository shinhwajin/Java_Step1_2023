package chapter06;

public class TBus {
	
	//멤버
	int busNumber;
	int passengerCount;
	int money;
	
	//디폴트 생성자 생략
	
	public TBus(int busNumber) {
		this.busNumber=busNumber;
	}
	
	public void take(int money) {  //승객이 낸 돈
		this.money += money;  //버스의 수입 증가
		passengerCount++;  //승객 수
	}
	
	public void showInfo() {  //버스의 정보 출력
		System.out.println("버스 "+busNumber+"번의 승객은 "+passengerCount+"명이고, 수입은 "+money+"원입니다.");
	}
	
	
}
