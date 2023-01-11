package chapter06;

import javax.swing.JOptionPane;

public class AccessTest {
	
	//필드
	private int aa;
	public int bb;
	int cc;
	
	//디폴트 생성자

	//메서드
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void Disp() {
		System.out.println("aa값 : "+aa+"\nbb값 : "+bb+"\ncc값 : "+cc);
	}
	

	public static void main(String[] args) {
		//객체(obj)
		AccessTest obj=new AccessTest();
		
		obj.setAa(10);  // =   obj.aa=10;
		obj.setBb(20);
		obj.setCc(30);
		
		obj.Disp();
	}



}
