package java_chobo.ch07;// 2.4

public class Shape {

	//String color = "blue";  //명시적 초기화. 생성자로 초기화하려면?
	String color;   //수퍼클래스로 생성뒤 이렇게 적으면 같다.
	
	
	public Shape() {   //생성자로 초기화하려면 수퍼클래스로 생성하여 이렇게 작성하면 같은 결과가 된다.
		color = "blue";
	}



	void draw() {
		//도형을 그린다
		
		
	}


	// 오버라이드. 조상의 메소드 내용을 재정의하는것
	@Override
	public String toString() {
		return String.format("Shape [color=%s]", color);
	}
	
}
