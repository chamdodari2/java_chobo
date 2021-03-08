package java_chobo.ch07; //2.4

public class Point {
	int x;
	int y; 
	
	
	// 수퍼 (기본생성자)
	public Point() {
		//x = 0;   //이것도 귀찮으면 this로 다른생성자(밑에 호출)해서 작성가능. 변수가 여러개일 경우에 이렇게 하는게 편하다.  
		//y = 0;   근데 이방법을 밖에나가면 대부분 쓴다.
		this(0,0);  //x에 0, y에 0넣어준다. 밑의 매개변수 넣은 생성자를 호출한다.
		
	}
	
	// 수퍼  (매개변수 넣은 생성자 )
	public Point(int x, int y) {  // 괄호안의 변수는 매개변수. x,y(지역변수와 같은이름)이 아니면 this로 구분 안해줘도 된다.
		this.x = x;    //this.를 붙이면  point 클래스 안에 있는 (필드에 있는)지역변수라고 구분하라고 알려주는것.
		this.y = y;
	}

	
	//오버라이드
	@Override
	public String toString() {
		return String.format("Point [x=%s, y=%s]", x, y);
	}
	
	
}
