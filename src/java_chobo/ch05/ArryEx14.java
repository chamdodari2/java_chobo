package java_chobo.ch05;

import java.util.Arrays;

public class ArryEx14 {
	//Arrays 클래스
	public static void main(String[] args) {
		//배열이 같은지 다른지 비교는 어떻게??
		int[] intArr1 = {1,2,3,4};
		int[] intArr2 = {1,2,3,4};
			System.out.println(Arrays.equals(intArr1, intArr2)); //이렇게하면된당 (equals사용!--> 이러한 기존에 만들어져있는함수들! API의 활용!)
			int[][] int2Arr1 = {{1,2},{2,3,5}}; //2차원 배열 비교는 어떻게?
			int[][] int2Arr2 = {{1,2,4},{2,3,5}};
			System.out.println(Arrays.deepEquals(int2Arr1, int2Arr2)); //deep으로한당
			
			System.out.println(Arrays.toString(intArr1)); //알맹이 확인
		//배열의 복사는??
			String[] strArr = {"전수린","우정아"}; //이걸 똑같은 배열에 복사하려면?
			String[] copyArr = Arrays.copyOf(strArr, strArr.length);  //copyof 활용
			System.out.println(Arrays.toString(copyArr));
			
			String[] strArr2 = {"김상건","이나연","신범건","정민강","김재룡","임준엽"}; //일부 인덱스의 데이터만 복사하고싶으면?
			String[] copyArr2 = Arrays.copyOfRange(strArr2, 2,5);  // (원본,시작인덱스,끝날인덱스-1) 
			System.out.println(Arrays.toString(copyArr2));
			
			//배열의 정렬  --> 버블소트 말고
			int[] intArr3 = {5,4,3,2,1};
			Arrays.sort(intArr3);  //sort함수가 있당.. 버블소트 직접 작성하는것보다 api인 sort 사용하면 실행속도도 빠르당
			System.out.println(Arrays.toString(intArr3));
			
			System.out.println(Arrays.binarySearch(intArr3, 5));  // 정렬후 binarysearch 하면 인덱스 부분출력이 가능하당
			
			//배열복사방법중 이것도 있다.  더 길이가큰 배열에 복사해서 옮기기. -->원본 어느인덱스부터, 어디까지 복사할지 지정가능.
			String[] copyArr3 = new String[5];
			System.arraycopy(strArr, 0, copyArr3, 0, strArr.length);
			System.out.println(Arrays.toString(copyArr3));
			
			
			
			
			
	}
	
}
