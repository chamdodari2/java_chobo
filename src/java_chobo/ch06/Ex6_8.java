package java_chobo.ch06;

import java.util.Scanner;

public class Ex6_8 { // 과제!!! 꼭 하기!!!!

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		factorial(sc);
		dectobin(sc);
		sc.close();

		int res = fact(5);   //재귀호출
		System.out.println("5! =  " + res);

	}

	private static int fact(int n) {
		// 종료조건이 반드시 존재
		if (n == 1) {
			return 1;
		} else {
			return  n * fact(n - 1);
		}

	}		// 재귀호출 end

	private static void dectobin(Scanner sc) {
		System.out.println("십진수를 입력하세요>");
		int num = sc.nextInt();

	}

	private static void factorial(Scanner sc) {
		System.out.printf("factorial 구할 수를 입력하세요 > ");
		// int num = sc.nextInt();
		// int fact = 1;
		// for(int i = num; i >= 1; i--) {
		// fact += (num * i);

		// }System.out.println(fact);

	}
}
