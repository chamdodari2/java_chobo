package java_chobo.ch04;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex4_15 {

	public static void main(String[] args) {
		
		//do - while문
		
		int input = 0;
		Random rnd = new Random(1234567); //괄호안에 있는걸 씨드값이라 한다. 씨드값을 적어주면 한번 랜ㄷ덤된 값을 저장해서 계속 나오게 함.
		int answer = rnd.nextInt(100) +1;
						
//		Scanner sc = new Scanner(System.in);
		String res = null;
			
	
		do {  //input = sc.nextInt();
			
			res = JOptionPane.showInputDialog("1과 100 사이의 정수를 입력하세요."); //.찍고 컨트롤+스페이스바 하고 첫번째꺼!! 글자가옆으로 휘어진것 :아이콘에 S는 스태틱(바로사용할수있는거 의미). 문자 10 -> "10"
			input = Integer.parseInt(res);
			
			System.out.println("입력값  "+ input+ " answer : "+ answer);
			
			if (input > answer) {
			}
			if (input < answer) {
				System.out.println("이상");
			}
		} while(input != answer);
		
		System.out.println("정답입니다");
	}

}
