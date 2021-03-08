package java_chobo.ch07;

import java.util.Arrays;

public class Triangle extends Shape {
	//클래스를 배열로 객체화
	Point[] p;
	
//수퍼클래스로 생성자
	public Triangle(Point[] p) {
		this.p = p;  //p를 받아서 전달
	}	

	public Triangle(Point p1, Point p2, Point p3) {
	this.p = new Point[]{p1, p2, p3};
		
		
		
			
		}
 //오버라이드
	@Override
	public String toString() {
		return String.format("Triangle [p=%s, color=%s]", Arrays.toString(p), super.toString());  //color내용을 출력하고싶으면 상속관계에 있는 shpe에 있으니까  이렇게 수퍼를 이용해 shpe가 재정의한 투스트링을 호출하면 되자ㅣ않을까? 
	}
	
	}
	


