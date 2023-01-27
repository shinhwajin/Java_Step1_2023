package chapter05;

import java.util.Scanner;

public class Method {
	
	//멤버변수(=필드)
	
	//생성자 생략
	
	//메소드
	void makeBread() {
		System.out.println("빵을 만듭니다");
	}//method1
	
	void makeBread(int count) {
		//()번째 빵을 만들었습니다
		for(int i=0;i<count;i++) {
			System.out.println((i+1)+"번째 빵을 만들었습니다");
		}
		System.out.println("요청하신 "+count+"개의 빵이 모두 완료되었습니다.");
	}//method2
	
	void makeBread(int count,String str) {
		for(int i=0;i<count;i++) {
			System.out.println((i+1)+"번째 "+str+"빵을 만들었습니다");
		}
		System.out.println("요청하신 "+count+"개의 "+str+"빵이 모두 완료되었습니다.");
	}//method3
	
	void order() {
		
		Scanner scan=new Scanner(System.in);
		boolean run=true;
		
		while(run) {
			System.out.println("1.빵 개수 선택 | 2.빵의 개수와 종류 | 3.종료");
			System.out.print("선택 > ");
			int a=scan.nextInt();
			if(a==1) {
				System.out.print("주문할 빵의 개수 : ");
				int count=scan.nextInt();
				for(int i=0;i<count;i++) {
					System.out.println((i+1)+"번째 빵을 만들었습니다");
				}
				System.out.println("요청하신 "+count+"개의 빵이 모두 완료되었습니다.");
			} else if(a==2) {
				System.out.print("주문할 빵의 개수 : ");
				int count=scan.nextInt();
				System.out.print("주문할 빵의 종류 : ");
				String str=scan.next();    //nextLine은 주문받고 enter도 같이 쳐짐
				for(int i =0;i<count;i++) {
					System.out.println((i+1)+"번째 "+str+"빵을 만들었습니다");
				}
				System.out.println("요청하신 "+count+"개의 "+str+"빵이 모두 완료되었습니다.");
			} else {
				run=false;
			}
		}//while
		System.out.println("주문 종료");
	}//order method

	
}//class
