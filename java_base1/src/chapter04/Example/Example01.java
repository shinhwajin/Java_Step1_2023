package chapter04.Example;

public class Example01 {

	public static void main(String[] args) {

		// for문을 이용하여 다음 배열의 점수를 줄 단위로 평균을 구하시오		
		int[][] array = { {95,86}, {83,92,96}, {78,83,93,87,88} };	
		
/*		int sum=0;
		int count=0;
		double avg=0;
		
		for (int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum += array[i][j];
				count++;
			}
			avg=sum/(double)count;
			System.out.println((i+1)+"번째줄 평균 : "+avg);
			sum=0;count=0;avg=0;
		}
*/

		
		//방법1
/*		int sum[]=new int[3];  //sum 배열을 만들어주고 각 합 넣어줌
		int count[]=new int[3];
		double avg=0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum[i] += array[i][j];
				count[i]++;
			}
			avg=sum[i]/(double)count[i];                   //count[i] = array[i].length
			System.out.println((i+1)+"번째줄 평균 : "+avg);
		}
*/	
		//방법2
/*		int total=0;
 		int counta=0;
		int alltotal=0;
		double avg=0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				total += array[i][j]; 
				counta++;
			}
			avg=total/(double)(array[i].length);
			System.out.println((i+1)+"번째줄 평균 : "+avg);
			//쓰레기값 초기화
			alltotal += total;
			total=0;avg=0;
		}
		double allavg=alltotal/(double)counta;
		System.out.println("전체 평균 : "+allavg);
*/
		//방법3
/*		int sum=0;
		int total=0;

		for(int[] num:array) {        // 95,86 => num 은 array에서 가져옴
			for(int score:num) {      //95 //86 => score은 num에서 가져옴
				total +=score;
			}//in for
			sum++;
			System.out.println(sum +"번째줄 학생의 합계 : "+total);
			total=0;
		}//out for
*/	
		
	}

}
