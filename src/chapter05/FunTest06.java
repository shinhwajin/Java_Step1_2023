package chapter05;

public class FunTest06 {
	
	public String channel;
	public int channelInt;
	public int volume;
	
	//생성자 생략
	
	//void 외에 모든 타입의 메소드는 반드시 꼭 return값을 갖는다
	public int channelUp(int volume) {
		this.volume=volume;   // volume에 들어간 값 heap(멤버변수 volume에 들어가게 해줌)   ////////////질문///////////////
		System.out.println("소리를 높이겠습니다.");
		return volume+2;
	}
	
	public void channelDown(int volume) {
		this.volume=volume;   // volume에 들어간 값 heap(멤버변수 volume에 들어가게 해줌)
		System.out.println("소리를 "+volume+"만큼 내리겠습니다.");
		//return volume+2;; // void는 절대 return값을 가지지 않음
		
	}
//=======================================================================================
	public static void main(String[] args) {

		FunTest06 tv=new FunTest06();

		//방법1
		//System.out.println("소리를 "+tv.channelUp(9)+"만큼 올립니다");
		//방법2
		int volume=tv.channelUp(9);//11
		System.out.println("소리를 "+volume+"만큼 올립니다");
		
		tv.channelDown(5);

	}

}
