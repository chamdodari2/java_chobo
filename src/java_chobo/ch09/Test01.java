package java_chobo.ch09;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int z = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("정수 두 개 입력");
		
		try {
		x = input.nextInt();
		y = input.nextInt();
		z = x * y;
		
		} catch(Exception e) {
			System.out.println("정수를 입력하셔야합니다.");
			e.printStackTrace();			
			z = x * y;
			
		}		
		finally {
		System.out.printf("%d*%d = %d %n",x,y,z);
		}

	}

}
