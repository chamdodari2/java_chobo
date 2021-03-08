package java_chobo.ch07.test03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student a = new Student("동양서울대학교", "전산정보학과", "20132222");
		//double[] avg = new double[8];

		// System.out.println("이름을 입력하세요.");
		// System.out.println("나이를 입력하세요.");
		// System.out.println("학교를 입력하세요.");
		// System.out.println("학과를 입력하세요.");
		// System.out.println("학번을 입력하세요.");

		System.out.println("8학기 학점을 순서대로 입력하세요.");

		for (int i = 0; i < a.avg.length; i++) {
			a.avg[i] = sc.nextDouble();
		} System.out.println(Arrays.toString(a.avg));
		a.average();
		
		
		
		System.out.println("8학기 총 평균 평점은");
		
		System.out.println(a.avg2);
	}

}
