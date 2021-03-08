package java_chobo.ch04; //과제 1~5번문제

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// exam01(scanner);

		// exam02(scanner);

		// exam03(scanner);

		// exam04(scanner);

		// exam05(scanner);

	}

	private static void exam05(Scanner scanner) {

		System.out.println("첫번째 정수를 입력하세요.");

		int a = scanner.nextInt();

		System.out.println("두번째 정수를 입력하세요.");

		int b = scanner.nextInt();

		System.out.println("세번째 정수를 입력하세요.");

		int c = scanner.nextInt();

		if (a <= b && a <= c) {

			System.out.println("가장 작은 값은" + a);

		} else if (b <= a && b <= c) {

			System.out.println("가장 작은 값은" + b);

		}

		else if (c <= a && c <= b) {

			System.out.println("가장 작은 값은" + c);

		}

	}

	private static void exam04(Scanner scanner) {

		System.out.println("나이를 입력해주세요");

		int age = scanner.nextInt();

		if ((age >= 20) && age <= 39) {

			System.out.println("신장(cm)을 입력해주세요");

			double cm = scanner.nextInt();

			cm = cm / 100;

			cm = cm * cm;

			System.out.println("체중(kg)을 입력해주세요");

			double kg = scanner.nextDouble();

			System.out.println();

			double bmi = (kg / cm);

			bmi = Math.floor(bmi * 10) / 10.0;

			System.out.printf("카우프 지수는 " + bmi);

			if (bmi <= 17.9 && age >= 20 && age <= 29) {

				System.out.println("  저체중입니다.");

			} else if (bmi >= 18 && bmi <= 23 && age >= 20 && age <= 29) {

				System.out.println("  표준체중입니다.");

			} else if (bmi >= 24 && bmi <= 30 && age >= 20 && age <= 29) {

				System.out.println("  과체중입니다.");

			} else if (bmi >= 30 && age >= 20 && age <= 29) {

				System.out.println("  비만입니다.");

			} else if (bmi <= 18.4 && age >= 30 && age <= 39) {

				System.out.println("  저체중입니다.");

			} else if (bmi >= 18.5 && bmi <= 24 && age >= 30 && age <= 39) {

				System.out.println("  표준체중입니다.");

			} else if (bmi >= 25 && bmi <= 30 && age >= 30 && age <= 39) {

				System.out.println("  과체중입니다.");

			} else if (bmi >= 30 && age >= 30 && age <= 39) {

				System.out.println("  비만입니다.");

			} else {

			}

		} else {

			System.out.println("20대와 30대만 확인 가능합니다.");

		}

	}

	private static void exam02(Scanner scanner) {

		System.out.println(" 하나의 영문자를 입력하세요. 소문자로 변환됩니다.");

		char munja = scanner.next().charAt(0);

		if ('A' <= munja && munja <= 'Z') {

			System.out.println((char) (munja + 'a' - 'A'));

		} else if ('a' <= munja && munja <= 'z') {

			System.out.println("소문자입니다. 대문자를 입력하세요");

		} else {

			System.out.println("영문자가 아닙니다.");

		}

	}

	private static void exam03(Scanner scanner) {

		System.out.println("어서오세요. 놀이공원에 입장하시려면 구매하실 항목의 번호를 선택해주세요.");

		System.out.printf("1.자유이용권%n2.입장권");

		System.out.println("");

		int ticket = scanner.nextInt();

		if (ticket == 1) {

			System.out.println("입장시간을 입력해주세요. (운영시간: 9시~24시)  주간: 9시~16시, 야간 :17시~24시)");

			int time = scanner.nextInt();

			{

				if (time < 9) {

					System.out.println("운영시간은 9시~24시 입니다. 돌아가세요!");

				} else if (time < 17) {

					System.out.println("주간입니다.");

					System.out.println("연령대를 입력하세요. 3세 미만은 입장할 수 없습니다.");

					int age = scanner.nextInt();

					if (age < 3) {

						System.out.println("3세 미만은 입장할 수 없습니다.");

					} else if (age < 13) {

						System.out.println("소인 입장료는 25,000원입니다.");

					} else if (age < 65) {

						System.out.println("대인 입장료는 34,000원 입니다");

					} else {

						System.out.println("어르신 입장료는 25,000원 입니다");

					}

				} else if (time < 25) {

					System.out.println("야간입니다.");

					System.out.println("연령대를 입력하세요. 3세 미만은 입장할 수 없습니다.");

					int age = scanner.nextInt();

					if (age < 3) {

						System.out.println("3세 미만은 입장할 수 없습니다.");

					} else if (age < 13) {

						System.out.println("소인 입장료는 25,000원입니다.");

					} else if (age < 65) {

						System.out.println("대인 입장료는 34,000원 입니다");

					} else {

						System.out.println("어르신 입장료는 25,000원 입니다");

					}

				} else {

					System.out.println("운영시간은 9시~24시 입니다. 돌아가세요!");

				}

			}

		} else if (ticket == 2) {

			System.out.println("입장시간을 입력해주세요. (운영시간: 9시~24시)  주간: 9시~16시, 야간 :17시~24시)");

			int time = scanner.nextInt();

			{

				if (time < 9) {

					System.out.println("운영시간은 9시~24시 입니다. 돌아가세요!");

				} else if (time < 17) {

					System.out.println("주간입니다.");

					System.out.println("연령대를 입력하세요. 3세 미만은 입장할 수 없습니다.");

					int age = scanner.nextInt();

					if (age < 3) {

						System.out.println("3세 미만은 입장할 수 없습니다.");

					} else if (age < 13) {

						System.out.println("소인 입장료는 20,000원입니다.");

					} else if (age < 65) {

						System.out.println("대인 입장료는 27,000원 입니다");

					} else {

						System.out.println("어르신 입장료는 20,000원 입니다");

					}

				} else if (time < 25) {

					System.out.println("야간입니다.");

					System.out.println("연령대를 입력하세요. 3세 미만은 입장할 수 없습니다.");

					int age = scanner.nextInt();

					if (age < 3) {

						System.out.println("3세 미만은 입장할 수 없습니다.");

					} else if (age < 13) {

						System.out.println("소인 입장료는 17,000원입니다.");

					} else if (age < 65) {

						System.out.println("대인 입장료는 23,000원 입니다");

					} else {

						System.out.println("어르신 입장료는 17,000원 입니다");

					}

				} else {

					System.out.println("운영시간은 9시~24시 입니다. 돌아가세요!");

				}

			}

		}

	}

	public static void exam01(Scanner scanner) {
		// 1번문제. 상점에서 하나에 100원인 물건을 판매하고 있다고 하자.
		// 물건을 10개 이상 사면 10%할인, 20개 이상은 15% 할인, 100개 이상은 20%한다고 가정하고 프로그램을 작성하시오.

		System.out.println("<알사탕가게> ");

		System.out.println("알사탕    1개  100원          (할인중)10개~19개  10%,  20개~99개  15%,  100개 이상   20%");

		System.out.println();

		System.out.println("직원 : 알사탕을 구매하실 갯수를 입력해주세요! 낱개로만 구매 가능해요!");

		int input = scanner.nextInt();

		if (input < 10) {
			System.out.println(input * 100 + "원입니다");
		} else if (input < 20) {
			System.out.println(input * 90 + "원입니다");
		} else if (input < 100) {
			System.out.println(input * 85 + "원입니다");
		} else {
			System.out.println(input * 80 + "원입니다");
		}

		// Test 02
		// 사용자로부터 하나의 문자를 입력받는다.
		// 만약 입력받은 문자가 대문자이면 소문자로 변환한다.
		// 만약 소문자이면 대문자를 입력하라는 메시지를 출력한다.
		// 참고로 대문자에서 'A를 빼고 'a를 더해주면 소문자로 변환된다
		// String x = scanner.toString();

	}
}