package java_chobo.ch03; //1.20 중요!!! 과제한거 연습해보기!! 

import java.util.Scanner;

public class Ex3_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 컨트롤+쉬프트+o 하기
//		exam01(sc);
//		exam02(sc);	
		//학생 스무명을 입력받아서 결과를 출력한다
		System.out.println("학생 수를 입력하세요. ");
		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			exam03(sc);
		}
		
	int jumsu = sc.nextInt();
		if (jumsu ==60) {
			
		}
	sc.close();

	}
	public static void exam03(Scanner sc) {
		// 점수를 입력받아서 
		//90점 이상이면 "수"
		//80점 이상이면 "우"
		//70점 이상이면 "미"
		//60점 이상이면 "양" 
		//그외 "가"가
		//출력되도록 하시오.
		System.out.println("점수를 입력하시오. (0~100)");
		int jumsu = sc.nextInt();
		//90점 이상이면 "수"
		String result = null;
		if (jumsu >= 90) {
			result ="수";
		}else if (jumsu >= 80) {//80점 이상이면 "우"
			result = "우";
		}else if (jumsu >= 70) {//70점 이상이면 "미"
			result = "미";
		}else if (jumsu >= 60) {//60점 이상이면 "양"
			result = "양";
		}else {
			result = "가";//그외 가
		}
		System.out.println("결과 " + result);
		
	}
//////////////////////////////////////////////
	public static void exam02(Scanner sc) {
		//점수를 입력받아서 60점 이상이면 "합격" 그렇지 않으면 "불합격"이 출력되도록 작성하시오
		int jumsu = sc.nextInt(); //점수입력받기
		String result = jumsu >= 60 ? "합격" : "불합격";
	
		System.out.println("결과는 " + result);
	}

	public static void exam01(Scanner sc) {
		System.out.println("두개의 정수를 입력하시오.");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int max = (a > b) ? a : b; // a가 b보다 크면 a 를 돌려주고 아니면 b를 돌려달라
		System.out.println(max);

		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println(max);
	}

}
