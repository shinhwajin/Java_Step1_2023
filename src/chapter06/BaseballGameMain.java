package chapter06;

public class BaseballGameMain {

	public static void main(String[] args) {

		String check = "";
		BaseballGame game = new BaseballGame();

		do {
			check = game.check();
		} while (check != "WIN");

/*		String check = "";
		BaseballGame2 game = new BaseballGame2();

		do {
			check = game.check();
		} while (check != "WIN");
*/		
	}// main

}// class

