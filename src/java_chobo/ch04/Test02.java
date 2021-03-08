package java_chobo.ch04;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
	

		Scanner scanner = new Scanner(System.in);

		// exam01a(scanner);

		// exam01b(scanner);

		// exam01c(scanner);

		// exam02(scanner);

		// exam03(scanner);

		// exam04a();

		// exam04b();

		// exam04c();

	}

	private static void exam04c() {

		for (int i = 0; i < 7; i++) {

			for (int j = 0; j < 7 - i; j++) {

				System.out.printf("*");

			}
			System.out.println();

		}

	}

	private static void exam04b() {

		for (int i = 1; i <= 7; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.printf("*");

			}
			System.out.println();

		}

	}

	private static void exam04a() {

		for (int i = 1; i <= 7; i++)

		{
			System.out.println("*******");

		}

	}

	private static void exam03(Scanner scanner) {

		int ans = 97;

		while (true) {

			System.out.print("정수를 입력하시오 : ");

			int input = scanner.nextInt();

			if (input < 0) {

				break;

			}

			if (input < ans) {

				System.out.println("UP");

			}

			else if (input > ans) {

				System.out.println("DOWN");

			} else if (input == ans) {

				System.out.println("정답입니다.");

				break;

			}

			else {

				break;

			}

		}

	}

	private static void exam02(Scanner scanner) {

		System.out.print("정수를 입력하세요. : ");

		int n = scanner.nextInt(); // 입력받기

		int res = 0; // 바뀐값 저장할곳 선언

		if (n < 0) {

			System.out.println("음수는 입력하실 수 없습니다.");

		} else if (n >= 0) {

			do {
				res = res * 10 + n % 10; // 10배로 곱한다. 입력받은 값을 10으로 나눈다.

				n /= 10;
			}

			while (n != 0);

			System.out.println(res);

		}

	}

	private static void exam01c(Scanner scanner) {

		int sum = 0;

		while (true) { // 걍 반복해라

			System.out.println("합산할 정수를 입력하세요"); // 물어보기

			int input = scanner.nextInt(); // 합할 숫자 입력받기

			sum += input; // 입력받은값 저장하기

			if (input == 0) {

				break;

			}

		}

		System.out.println("합산된 값은 " + sum);

	}

	private static void exam01b(Scanner scanner) {

		System.out.println("합산하려는 정수의 갯수를 지정하세요");

		int count = scanner.nextInt();

		int sum = 0;

		for (int ask = 1; ask <= count; ask++) {

			System.out.println("합산할 정수를 입력하세요");

			int input = scanner.nextInt();

			sum = sum + input;

		}

		System.out.println("합산된 값은  : " + sum);

	}

	private static void exam01a(Scanner scanner) {

		System.out.println("합산을 시작할 정수를 입력하세요. ");

		int start = scanner.nextInt();

		System.out.println("합산을 끝낼 정수를 입력하세요. ");

		int end = scanner.nextInt();

		int sum = 0;

		for (int k = start; k <= end; k++) {

			sum = sum + k;

		}

		System.out.printf("%d에서부터 %d까지의 합은 %d ", start, end, sum);

	}

}