package chapter07;

public class Overload {

	private String name; // private -> 메소드 통해서만
	private int age;
	private float h;

	public Overload() {
		age = 0;
		h = 0;
		name = "익명";
	}

	public Overload(int a, float b) {
		age = a;
		h = b;
		name = "익명";
	}

	public Overload(int a, float b, String n) {
		age = a;
		h = b;
		name = n;
	}
	
	public void Disp() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+h);
	}
	
	
	
	
}
