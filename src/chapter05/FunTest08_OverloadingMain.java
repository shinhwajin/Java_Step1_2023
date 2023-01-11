package chapter05;

public class FunTest08_OverloadingMain {

	public static void main(String[] args) {
		FunTest08_Overloading obj=new FunTest08_Overloading();
		
		obj.getResult(1);
		obj.getResult('a');
		obj.getResult("hi");
		obj.getResult(6,"2023");
		
	}

}
