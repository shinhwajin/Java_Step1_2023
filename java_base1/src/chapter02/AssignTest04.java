package chapter02;

public class AssignTest04 {

	public static void main(String[] args) {
		//전위연산
		System.out.println("===전위연산===");
		int gameScore=150;
		//int lastScore1=gameScore+1;
		int lastScore1=++gameScore;  //더한 후 대입
		System.out.println(lastScore1);  //151
		System.out.println("============");
		int lastScore2=--gameScore;
		System.out.println(lastScore2);  //150
		
		//후위연산
		System.out.println("===후위연산===");
		int lastScore3=gameScore++;  //읽은 후 대입 후 더하기
		System.out.println(lastScore3);  //150
		System.out.println(gameScore);  //151
		System.out.println("============");
		
		int lastScore4=gameScore--;
		System.out.println(lastScore4);  //151
		System.out.println(gameScore);  //150


	}
}
