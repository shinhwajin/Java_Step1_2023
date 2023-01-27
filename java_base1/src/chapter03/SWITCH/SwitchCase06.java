package chapter03.SWITCH;

public class SwitchCase06 {

	public static void main(String[] args) {
		// 오전 9 ~ 오후 6
		int time=(int)(Math.random()*10)+9;
		System.out.println("[현재 시간 : " +time+ "시]");
		System.out.print("할 일 : ");
		
		switch (time) {
		case 9:case 15:
			System.out.println("수업듣기");
			break;
		case 11:case 16:
			System.out.println("실습하기");
			break;
		case 13:
			System.out.println("점심식사");
			break;
		case 14:
			System.out.println("낮잠자기");
			break;
		case 18:
			System.out.println("집갈준비");
			break;
		default:
			System.out.println("복습하기");
		}

	}

}
