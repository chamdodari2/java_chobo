package java_chobo.ch05;

import java.util.Arrays;

public class ArrayEx05 {

	public static void main(String[] args) {
		// 선형검색
		int[] intArr = { 9, 10, 23, 15, 4, 3, 1, 2, 99, 100 };

		int searchKey = 6;
		int find = linearSearch(intArr, searchKey);
		int find2 = binarySearch(intArr, searchKey);
		System.out.printf("선형 검색 : intArr에서 %d를 검색한 결과 %d에 위치함%n", searchKey, find);
		System.out.printf("이분 검색 : intArr에서 %d를 검색한 결과 %d에 위치함", searchKey, find);
	}

	private static int binarySearch(int[] intArr, int searchKey) {
		// 1. 정렬
		for (int i = 0; i < intArr.length - 1; i++) {
			if (intArr[i] > intArr[i + 1]) {
				int tmp = intArr[i];
				intArr[i] = intArr[i + 1];
				intArr[i + 1] = tmp;
			}
		}
		System.out.println(Arrays.toString(intArr));

		// 2. 검색
		int left = 0;  //left 선언
		int right = intArr.length - 1; //right 선언, intArr -1
		int mid;  // mid 선언
		for (; left >= right;) {  //left(0)가 right와 같거나 크면
			mid = (left + right) / 2;  //mid는 
			System.out.printf("left %d right %d searchKey %d%n", left, mid);
			if (intArr[mid] == searchKey) {
				return mid;
			} else if (intArr[mid] > searchKey) {
				right = mid - 1;
			} else {
				right = mid + 1;
				{
					left = mid + 1;
				}
			}
		
		}
		return -1;

	}

	private static int linearSearch(int[] intArr, int searchKey) {
		int a = -1;
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] == searchKey) {
				a = i;
				break;

			}
		}

		return a;
	}

}
