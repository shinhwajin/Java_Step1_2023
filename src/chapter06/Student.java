package chapter06;

public class Student {
	
	//필드
	int studentID;
	public String studentName;
	int grade;
	String address;

	//디폴트 생성자(free compile) -기본 / 이거 쓸거면 생략하면 안됨
	//오버로딩된 생성자가 있을 시 디폴트를 사용하기 위해서는 반드시 명시한다.(생략 불가능)
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자 오버로딩 - 디폴트 생성자보다 우선권을 가짐  : 변하지 않는 중요한 변수
	public Student(String studentName,String address) {
		this.studentName=studentName;
		this.address=address;
	}
	
	//메소드
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void showStudentInfo() {
		System.out.println(studentName+", "+address);
	}
	
	
}
