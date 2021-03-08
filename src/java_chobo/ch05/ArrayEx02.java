package java_chobo.ch05; //import 하기 : 컨+쉬+o

import java.util.Arrays;
import java.util.Random;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[] intArr = new int[10];
		
		Random rnd = new Random();  //임의의 정수 넣기
		for (int i =0; i<intArr.length;i++) { //등호를 안쓰는게 좋다. 배열의 범위를 초과하기때문에 에러뜬다.
			intArr[i] = rnd.nextInt(45)+1;
			
		}
		System.out.println(Arrays.toString(intArr));

	}

}
