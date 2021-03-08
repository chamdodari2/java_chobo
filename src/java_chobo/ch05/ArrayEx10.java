package java_chobo.ch05;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx10 {

	public static void main(String[] args) {

		// 각 점수별 몇명인지 출력하기.
		int[] score = new int[100]; // 100개의 점수 출력

		Random rnd = new Random(123456);
		for (int i = 0; i < score.length; i++) {
			score[i] = rnd.nextInt(100) + 1; // 100개의 정수 랜덤으로 집어넣기
		}

		System.out.println(Arrays.toString(score));
		prnArr(score);
		statScore(score);

	}

	private static void statScore(int[] score) {
		int[] stat = new int[11]; // 새 배열(stat) 생성
		for (int i = 0; i < score.length; i++) { // score 배열의 인덱스 0~99까지 순회.
			stat[score[i] / 10]++;  // 키포인트!!!  // score [0] /10 --> score[0]의 실제값/10  -->  예) 47/10=4 .
									//stat[4]++인것. --->
									// score 배열의 인덱스 0~99까지 순회하면서, 한번 방문할때마다 인덱스가 가리키는 실제값 /10을 해서 90점일경우 9--> stat[9]인덱스에 실제데이터 1을 추가해줌
		}

		for (int i = 0; i < stat.length; i++) {
			System.out.printf("%3d점 : ", i * 10);
			
			for (int s = 0; s < stat[i]; s++) {  // 인덱스가 가리키는 데이터만큼 별찍기
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void prnArr(int[] score) {
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%3d ", score[cnt]);
				cnt++;

			}
			System.out.println();

		}

	}

}
