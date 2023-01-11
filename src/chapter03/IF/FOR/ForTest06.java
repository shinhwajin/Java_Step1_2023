package chapter03.IF.FOR;

public class ForTest06 {

	public static void main(String[] args) {
		
		int i;
		char a='A';  //ASCII CODE : 65
		
		//i=a; =  //i=(int)a;  //a=i 는 안됨(바이트 i(4)>a(2)) -> a=(char)i
		//System.out.printf("%c ",i);
		//String -> char => charAt(0)
		
		
		for(i=a; i<='Z'; i++) {
			System.out.printf("%c ",i);
		}
		
	
	}
	
}
