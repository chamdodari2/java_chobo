package java_chobo.ch05;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 배열의 요소의 값의 합계, 평균
	
		//랜덤클래스 선언하기
		Random rnd = new Random(123456); //첨에 랜덤값 생성,ㅇ ㅣ후 동일하게 출력
		
		//size가 5인 정수형 배열 선언
		int[] intArr = new int[5];
	
		for(int i = 0; i <intArr.length; i++) {
			intArr[i] = rnd.nextInt(20) + 1;  //1부터 10까지
		}
		System.out.println(Arrays.toString(intArr));
		
		//1. 배열에 있는 값들의 합을 구하시오.
		int sum = 0;
		for(int j = 0;j < intArr.length; j++) {
			sum = sum + intArr[j];
		} System.out.println("합은"+ sum);
		
		//2. 배열에 있는 값들의 평균을 구하시오.
		
		 System.out.println("intArr의 평균은"+(double)sum/intArr.length);
		
		// bubble sort - > 이중Loop 돌려야한다.
		 //i =0 일때. 첫번째자리와 두번째 비교. 앞에꺼가 크면 바꾸기. (5,4)->(4,5)
		 // 그럼 i는 1로 바뀜. 
		 
		 
		 
		 
		 
		 
		
	}

}
