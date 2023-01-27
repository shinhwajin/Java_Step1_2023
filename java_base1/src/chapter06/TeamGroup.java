package chapter06;

public class TeamGroup {

	// 멤버변수(배열->팀구성원)
	private TeamMember[] member = new TeamMember[6]; // TeamMember을 다 끌어옴

	// 기본 생성자

	// 초기화 메소드
	public void init() {
		member[0] = new TeamMember("조현수", "남");
		member[1] = new TeamMember("신진혁", "남");
		member[2] = new TeamMember("정하영", "남");
		member[3] = new TeamMember("이진학", "남");
		member[4] = new TeamMember("신화진", "남");
		member[5] = new TeamMember("윤혜경", "남");
	}

	// 출력 메소드

	public void Disp() {
		for (int i = 0; i < member.length; i++) {
			System.out.println("성명 : " + member[i].getName() + ", 성별 : " + member[i].getGender());
		}
	}

}
