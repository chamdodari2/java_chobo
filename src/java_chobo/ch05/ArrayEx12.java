package java_chobo.ch05;

public class ArrayEx12 {
	// 가변배열
	public static void main(String[] args) {

		int[][] intArr = { // 이것도 가능하다   [] [이부분]길이다르게.
				{ 1, 2 }, { 3, 4, 5, 6 }, { 4, 5, 6 } };
		int[][] intArr2 = new int[3][]; // 행만 결정하고 커럼은 결정하지않는것도 가능 (0수정됨.)
		intArr2[0] = new int[2];
		intArr2[1] = new int[5];
		intArr2[2] = new int[3];

		prnArr(intArr);
		System.out.println();
		prnArr(intArr2);

	}

	private static void prnArr(int[][] intArr) {
		for (int row = 0; row < intArr.length; row++) {
			for (int col = 0; col < intArr[row].length; col++) {
				System.out.printf("%d ", intArr[row][col]);
			}
		}

	}

}
