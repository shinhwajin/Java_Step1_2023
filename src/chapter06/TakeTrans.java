package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		
		//학생 2명 생성
		StdInfo studentJames=new StdInfo("James", 12000);
		StdInfo studentTom=new StdInfo("Tom", 10000);
		
		//버스타기
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);  //StdInfo 안에 takeBus안에 bus.take 들어있음
		studentJames.showInfo();//지출
		bus100.showInfo();  //수입 증가, 인원수 증가
		System.out.println("----------------------------------------");

		Bus bus987=new Bus(987);
		studentTom.takeBus(bus987);
		studentTom.showInfo();
		bus987.showInfo();
		System.out.println("========================================");

		//지하철타기
		Subway subwayGreen=new Subway("2호선");
		studentJames.takeSubway(subwayGreen);
		studentJames.showInfo();
		subwayGreen.showInfo();
		System.out.println("----------------------------------------");
		
		Subway subwayBlue=new Subway("1호선");
		studentTom.takeSubway(subwayBlue);
		studentTom.showInfo();
		subwayBlue.showInfo();

	}

}
