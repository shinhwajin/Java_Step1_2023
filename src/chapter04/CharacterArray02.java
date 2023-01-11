package chapter04;

public class CharacterArray02 {

	public static void main(String[] args) {

		char alphabets[]=new char[26];
		char ch='A';  //65
		//System.out.println(ch++);
		//System.out.println(ch);
		
		/*
		for(int i=0;i<alphabets.length;i++) {
			alphabets[i]=ch++;
			System.out.print(alphabets[i]+" ");
		}
		*/
		for(int i=0;i<alphabets.length;i++,ch++) {
			alphabets[i]=ch;
			System.out.print("("+alphabets[i]+","+(int)(alphabets[i])+") ");
		}
		
	}
}
