package java_chobo.ch07;

public class Circle  extends Shape{  //Shape 클래스를 상속받는다.
	Point center; //점
	int r; //반지름
	
	
						//수퍼 생성자.
	public Circle() {  //상속관계. 위의 Circle 클래스가 사라지면 얘도 같이 사라진다.
		this(new Point(0,0),100); // 밑의 생성자를 호출한 방법인 이렇게 적어도 같은의미이다.
//		center = new Point(0,0);
//		r = 100;
		
	}



	//생성자 (필드로) : 외부에서 초기화값을 만들어서 던져주겠다	 : 포함관계 ?
	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	

}
