package java_chobo.ch06;

import java_chobo.ch06.dto.Data;

class SubData extends Data { // 알쉬S 해서 Data 클래스 상속받기.

	public SubData() {
		super();
		x = 10;
	}

}

public class Ex6_7 {

	public static void main(String[] args) {
		Data d = new Data();  //클래스영역??
		d.x = 10;		//힙영역
		System.out.println("main() : x = " + d.x);
		
		change(d.x); //메소드 호출
		System.out.println("main() : x = " + d.x);

		Data d2 = new Data();
		d2.x = 20;
		System.out.println(" main() : x = " + d2.x);

		// 중첩정의인 오버로딩 배우기
		change(d2);  //메소드 호출
		System.out.println(" main() : x = " + d2.x);

		System.out.println();
		Data d3 = new Data();
		d3.x = 40;
		
		Data d4 = copy(d3); // 카피라는 메소드 호출. 얘가 복사해서 참조되게하곘다
		System.out.println(" main() d4.x = " + d4.x);
	}

	private static Data copy(Data d) { // 리턴타입이 있어햐나느것. 참조데이터가 두개가 있어야함. 다른곳 가리켜야함
		Data temp = new Data();
		temp.x = d.x;
		return temp;

	}

	
	
	private static void change(Data d) { // 중첩정의. 메소드 오버로딩. 기본형이 아닌 참조형으로 정의했을때?
		d.x = 30;
		System.out.println("chang() : x = " + d.x);
		

	}

	private static void change(int x) {
		x = 1000;
		System.out.println("chang() : x = " + x);

	}

}
