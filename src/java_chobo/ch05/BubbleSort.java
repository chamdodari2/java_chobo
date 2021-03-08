package java_chobo.ch05;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] intArr = { 5, 4, 3, 2, 1 };
		System.out.println("정렬 전 -" + Arrays.toString(intArr));

		bubleSort(intArr);
		System.out.println("정렬 후 -" + Arrays.toString(intArr));

	}

	private static void bubleSort(int[] intArr) {
		for (int j = 0; j < intArr.length - 1; j++) {  //intArr의 길이(5) -1회만큼 순회. 한번 방문할때마다 앞의주소보다 뒤의 주소가 가리키는 데이터가 크다면 int temp에 넣는다.
			for (int i = 0; i < intArr.length - j-1; i++) {
				if (intArr[i] > intArr[i + 1]) {

					int temp = intArr[i];
					intArr[i] = intArr[i + 1]; //임시공간 temp에 큰값을 담아놨다가 뒷자리로 옮기기
					intArr[i + 1] = temp;
				}
			}
			System.out.println( Arrays.toString(intArr));
		}
	}

}
