package java_chobo.ch05;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		int[] intArr = {5,4};
		System.out.println(Arrays.toString(intArr));
		//배열 값 변경하기. intArr[0]과 intArr[1] 교환
		// 반드시 임시공간(예)변수 temp)생성이 필요하다.
		
		int temp = intArr[0];
		intArr[0] = intArr[1];
		intArr[1] = temp;
		System.out.println(Arrays.toString(intArr));
	
		
		
	
	}

}
