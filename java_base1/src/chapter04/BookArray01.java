package chapter04;

public class BookArray01 {

	public static void main(String[] args) {
		
	  //Book bk=new Book();	
	  //bk.getBookname();     //5개
		
		Book[] bk=new Book[5];  //
		
		for(int i=0;i<bk.length;i++) {
			System.out.println(bk[i]);
		}

		
		
	}
}
