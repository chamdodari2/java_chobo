package java_chobo.ch06;

import java_chobo.ch06.dto.Card; // 패키지가 다르면 임포트해야한다

public class Ex6_6 {

	public static void main(String[] args) {
		System.out.printf("Card.WIDTH = %d%n",Card.WIDTH);
		System.out.printf("Card.HEIGHT = %d%n",Card.HEIGHT);

		
		Card c1= new Card(); //Card 클래스 안에서 생성자 안만들어줬는데 자바컴파일러가 자동으로 만들어줘서 여기서 에러안뜸.
		System.out.println(c1); //참조변수면 c1.toString() 호출. 오버라이드 했기때문
	c1.setKind("Heart");
	c1.setNumber(7);
	System.out.println(c1);
	System.out.printf("c1.kind = %s, c1.number = %d%n",c1.getKind(),c1.getNumber());
	System.out.println(c1);
	Card c2 = new Card();
	c2.setKind("spade");
	c2.setNumber(4);
	System.out.println(c2);
	
	Card.WIDTH = 50;
	Card.HEIGHT = 80;
	
	System.out.printf("c1.WIDTH = %d%n",c1.WIDTH);
	System.out.printf("c1.HEIGHT = %d%n",c1.HEIGHT);
	}

}
