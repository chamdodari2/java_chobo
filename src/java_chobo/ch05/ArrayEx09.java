package java_chobo.ch05;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx09 {
	
	// 알+쉬+j
	//2차원 배열

	public static void main(String[] args) {
		int [][] score = new int [4][3];  //2차원 배열 선언과 초기화한것.
		
		System.out.println(Arrays.deepToString(score)); // 2차원 배열 [][] 둘다 전체출력해서 보기.
		Random rnd = new Random(123456);		
		for(int row = 0; row <score.length; row++) { // score[row] 총 길이만큼 임의의 값 넣기.
			for(int col = 0; col < score[row].length; col++) { //score[][col] 총 길이만큼 임의의 값 넣기
				score[row][col] = rnd.nextInt(100) +1;
			}
		}
		
//		prnArr(score);   //이쁘게  전체출력
//		
//		int sum = sumArr(score);
//		System.out.println("배열 값의 합은"+ sum);
//		
		점수구하기(score);
		
	}

	private static void 점수구하기(int[][] score) {
		// 국어 영어 수학 총점평균
		// 과목별 총점
		
		
		
		
		int korTotal =0;
		int engTotal =0;
		int mathTotal = 0;
		for(int row = 0; row <score.length; row++) {
			int sum = 0;
			korTotal += score[row][0];
			engTotal += score[row][1];
			mathTotal += score[row][2];
			for(int col = 0; col<score[row].length; col++){
				System.out.printf("%3d", score[row][col]);
				sum = sum+score[row][col];
			}
			System.out.printf("%3d %5.1f%n", sum,(double)sum/score[row].length);
		
		}System.out.printf("%3d %3d %3d%n ", korTotal,engTotal,mathTotal);
		
		
	
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

	private static int sumArr(int[][] score) {  //합산하기
		int sum = 0;
		for(int row=0; row<score.length;row++) {  //score 전체길이까지
			for(int col=0; col <score[row].length;col++) { //score[row]전체길이까지
				sum = sum+score[row] [col];  //  값 합산 ??
			}
		}
		return sum;
	}

	private static void prnArr(int[][] score) {
		for(int[] intArr : score) {  //score에 있는 첫번째꺼 던져준다 . int[] intArr-->score[][이거]가리킴.
			for(int s : intArr) {   // "
				System.out.printf(s + " ");
			}
			System.out.println();
		}		
	}

}
