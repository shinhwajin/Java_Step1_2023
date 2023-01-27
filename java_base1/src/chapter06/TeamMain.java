package chapter06;

public class TeamMain {

	public static void main(String[] args) {

		TeamGroup team = new TeamGroup();
		TeamMember t = new TeamMember();

		// 메소드를 통해서 팀명 초기화
		t.setTeamName("A");
		System.out.println("팀명 : " + t.getTeamName());
		System.out.println("------[팀원 명단]------");
		team.init();
		team.Disp();

		System.out.println();
		t.setmName("조현수");
		t.setmPhone("010-1111-1111");
		t.setsName("신진혁");
		System.out.println("팀장 : " + t.getmName());
		System.out.println("팀장번호 : " + t.getmPhone());
		System.out.println("부팀장 : " + t.getsName());

	}

}
