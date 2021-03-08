package java_chobo.ch03; //1.20

import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {
		//99쪽
		
		/** int x = 0;
		System.out.printf(" x = %d 일 때, 참인 것은 %n", x); // x에 x값을 넣었을때 "참인것은" 출력

		if (x == 0)
			System.out.println("x==0");
		if (x != 0)
			System.out.println("x!=0");
		if (!(x == 0))
			System.out.println("!(x==0)");
		if (!(x != 0))
			System.out.println("!(x!=0)");

		x = 1;
		System.out.printf("x=%d 일 때 , 참인 것은 %n", x);
		if (x == 0)
			System.out.println("x==0");
		if (x != 0)
			System.out.println("x!=0");
		if (!(x == 0))
			System.out.println("!(x==0)");
		if (!(x != 0))
			System.out.println("!(x!=0)");
**/
		
		// 교재 105쪽 예제
		
		int score = 0;
		char grade = ' ', opt = '0';

		System.out.print("점수를 입력해주세요.");

		Scanner scanner = new Scanner(System.in); // system.in이 들어갔기 때문에, 키보드로 입력되는 값을 저장해서 알려주겠다는 뜻
		score = scanner.nextInt(); // 정수만 입력받을때 사용.

		System.out.printf("당신의 점수는 %d입니다.%n", score);

		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			} 

		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';

			} else if (score < 84) {
				opt = '-';
			}
		} else {
			grade = 'C';

		}
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
	}

}










