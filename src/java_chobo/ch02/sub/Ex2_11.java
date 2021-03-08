package java_chobo.ch02.sub;//키보드로부터 입력받는것은 Scanner다.걍외우기

import java.util.Scanner;

public class Ex2_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		add(sc);//블럭 지정후 알트+쉬프트+m 한 결과
		sub(sc); //스캐너 여러개 생성할 필요없음
		
		sc.close();//입력 스캐너 닫아주기

	}
	
	public static void sub( Scanner sc) {
//		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 정수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("num1 - num2" + (num1 - num2));
	
	}

	public static void add(Scanner sc) {
		System.out.println("두 개의 정수를 입력하세요 > ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("두 정수의 합은" + (num1 + num2));
	}
//	sc.close();
}
