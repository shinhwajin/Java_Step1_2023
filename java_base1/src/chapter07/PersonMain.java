package chapter07;

public class PersonMain {

	public static void main(String[] args) {

		// 기본 생성자
		Person p1 = new Person();
		System.out.println(p1.name = "김유신");
		System.out.println(p1.height = 180f);
		System.out.println(p1.weight = 80f);

		System.out.println("------------------------");

		Person p2 = new Person("강감찬");
		System.out.println(p2.name);
		System.out.println(p2.height = 175f);
		System.out.println(p2.weight = 75f);

		System.out.println("------------------------");

		Person p3 = new Person("이순신", 170f, 70f);
		System.out.println(p3.name);
		System.out.println(p3.height);
		System.out.println(p3.weight);

	}
}
