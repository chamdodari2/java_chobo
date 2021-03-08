package java_chobo.ch02.sub;

import java.util.Scanner; //외부클래스 호출하려면 import가 필요하다
//자동 import는  ctrl+shift+o다. 추가하거나 정리하고싶으면 쓰기
public class Ex2_10 {

	public static void main(String[] args) {
		// 키보드로부터 입력을 받는 클래스 Scanner (알아둬야함)
		
		Scanner sc = new Scanner(System.in); //key로입력받기 생성된거임
	
//		System.out.print("정수를 입력하세요. ");
//		int num = sc.nextIne(); //키보드로부터 정수를 입력받겠다고 약속한거. 리턴값(결과값) int형으로 num에 저장하겠다
					
//		System.out.println("num = " + num);
		
		System.out.println("문자를 입력하세요 > ");
		String resStr = sc.nextLine(); //문자 입력받기. 숫자 작성할시 문자화된 "1000"로 입력된다.
		
		System.out.println("resStr = " + num);
		
		int num = Integer.parseInt(resStr);//"1000" -> 1000 (문자로 입력된걸 숫자로 변경해줌)
		
		sc.close(); //닫아줘야함
//		Ex2_9.varPrint(); //다른 패키지에 있는 외부클래스 함수 호출
		
	}

}
