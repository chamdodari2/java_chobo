package java_chobo.ch05;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 배열

		array_01();
		
		char[] chArr = {'a','b','c','d'};  //중괄호로 초기화 가능
		System.out.println(Arrays.toString(chArr));
		prnChArr(chArr);
		
		
	}

	private static void prnChArr(char[] chArr) {
		
		System.out.println("method-start");
		for(int i = 0; i <chArr.length; i++) { //배열의 길이만큼
			System.out.printf("%c " , chArr[i] );
		}
		System.out.println("method-end");
		
	}

	public static void array_01() {
		int[] score = new int[5];
		System.out.println("main-start");
		System.out.println(Arrays.toString(score)); // [0, 0, 0, 0, 0] 출력 - 1
		
		prnArr(score);  //얘 호출.
		
		score[0] = 10; //[10, 0, 0, 0, 100] -3
		System.out.println(Arrays.toString(score));
		prnArr(score); //[10, 0, 0, 0,100] - 4
		
		System.out.println(Arrays.toString(score));  //[] 5
		System.out.println("main-end");
	}

	private static void prnArr(int[] arr) {
		System.out.println("prnArr()-start");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d  ", arr[i]);
		}
		System.out.println();// [0, 0, 0, 0, 0] 출력 - 2
		
		arr[4] = 100;		// [0, 0, 0, 0 100] 출력- 3 이후 위로 올라가서 prn 수행
		System.out.println("prnArr()-end");
	}

}
