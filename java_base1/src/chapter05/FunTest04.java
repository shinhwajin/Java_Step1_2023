package chapter05;

import javax.swing.JOptionPane;

public class FunTest04 {
	
	public static void Disp(String A[]) {
		String res="";
		
		for(int i=0;i<A.length;i++) {
			res += A[i]+" ";
		}//for
		
		
/*		for(String str:A) {     //A를 str로 복사
			res += str + " ";   // res는 복사된 str가 하나씩 축적
		}
*/		
		
	
		System.out.println(res);
		JOptionPane.showMessageDialog(null, "배열의 원소값\n\n"+res);
	}

	public static void main(String[] args) {
		String str[]= {"Java", "Oracle", "Jsp", "Html5, Css, Js, Jq", "SprintBoot", "PythonCamp"};  //=> 위 함수만드는거의 A
		
		Disp(str);
	};

}

