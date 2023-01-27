package chapter06;

public class TStdInfo {

	//필드
	public String studentName;
	public int grade;
	public int money;
	
	//free compile
	
	//생성자 오버로딩
	public TStdInfo(String studentName, int money) {  //set
		this.studentName=studentName;
		this.money=money;
	}
	
	//버스
	public void takeBus(TBus bus) {  //bus객체를 매개변수로 가져올 수 있음 
		bus.take(1000);  //            (TBus bus=new TBus();)
		this.money -= 1000;  //학생 지출
	}
	//지하철
	public void takeSubway(TSubway subway) {
		subway.take(1500);
		this.money -= 1500;  //학생 지출
		}
	//남은 잔액
		public void showInfo() {
			System.out.println(studentName+"님의 잔액은 : "+money+"원 입니다.");
		}
		
	
}
