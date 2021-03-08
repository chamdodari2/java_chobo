package java_chobo.ch02.sub;

public class Ex2_12 {

	public static void main(String[] args) {
		// 1. 정수를 문자로 9 ->'9' (교재66쪽)
		char ch = (char)(9 + '0'); //char로 형변환
		System.out.println("숫자를 문자로 > "+ ch);
		
		//2.문자열을 정수로로 변환
		int num = Integer.parseInt("77");
		System.out.println("문자를 숫자로 > " + num);

		//2.1 문자열을 실수로 변환
			double dNum =Double.parseDouble("77.3");	
			System.out.println("문자를 실수로 > " + dNum);
				
		//3.정수를 문자열로
		String numStr = Integer.toString(99);//99라는 숫자를 입력받으면 문자로 변경해달라
		System.out.println("숫자를 문자로 > " + numStr);
		
		//4.문자열에서 문자를 추출
		String str = "abcd";
		char chStr = str.charAt(2); //문자중 2번째
		System.out.println(str + " index = 2인 문자 추출"+ chStr);
		
		
		//5. 문자를 문자열로 변경 'a' = "a"
		System.out.println("문자를 문자열로" + ('a' + ""));
		System.out.println("정수를 문자열로" + (9 + ""));
		System.out.println("정수를 문자열로" + Integer.toString(9));//숫자 9를 문자열로 변경
		
		
		
	}

}
