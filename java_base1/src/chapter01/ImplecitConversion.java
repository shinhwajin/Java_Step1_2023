package chapter01;

public class ImplecitConversion {

	public static void main(String[] args) {
		//묵시적 형변환 : 작은 메모리에서 큰 메모리로 자연스럽게 형변환
		
		byte bNum=10;  //8비트
		int iNum=bNum;  //4바이트
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		//묵시적 형변환 : 더 정밀한 수로 자연스럽게 암시적 형변환
		
		int iNum2=20;
		float fNum=iNum2;
		
		System.out.println("==================");
		System.out.println(iNum2);
		System.out.println(fNum);

	}

}
