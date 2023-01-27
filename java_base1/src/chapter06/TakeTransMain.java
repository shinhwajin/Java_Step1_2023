package chapter06;

public class TakeTransMain {

	public static void main(String[] args) {
		
		//학생 2명 생성
		TStdInfo studentJames=new TStdInfo("James", 12000);
		TStdInfo studentTom=new TStdInfo("Tom", 10000);
		
		//버스타기
		TBus bus100=new TBus(100);
		studentJames.takeBus(bus100);  //StdInfo의 takeBus안에 bus.take 들어있음
		studentJames.showInfo();//지출
		bus100.showInfo();  //수입 증가, 인원수 증가
		System.out.println("----------------------------------------");

		TBus bus987=new TBus(987);
		studentTom.takeBus(bus987);
		studentTom.showInfo();
		bus987.showInfo();
		System.out.println("========================================");

		//지하철타기
		TSubway subwayGreen=new TSubway("2호선");
		studentJames.takeSubway(subwayGreen);
		studentJames.showInfo();
		subwayGreen.showInfo();
		System.out.println("----------------------------------------");
		
		TSubway subwayBlue=new TSubway("1호선");
		studentTom.takeSubway(subwayBlue);
		studentTom.showInfo();
		subwayBlue.showInfo();

	}

}
