package java_chobo.ch07;

public class Exam06_1 {

	public static void main(String[] args) {
//		exam_circle();
	

		Point p1 = new Point(100,100);  //point(클래스) 타입의 참조변수p1이 가진   x,y의 값 초기화
		Point p2 = new Point(140,50); //point(클래스) 타입의 참조변수p2가 가진   x,y의 값 초기화
		Point p3 = new Point(200,100); //point(클래스) 타입의 참조변수p3가 가진   x,y의 값 초기화
		
		Triangle tri1 = new Triangle(new Point[] {p1,p2,p3});  // 배열로 전달 (위의 p1,p2,p3의 값들을 넣기)
		System.out.printf("%d %d%n",tri1.p[0].x,tri1.p[0].y);
		System.out.printf("%d %d%n",tri1.p[1].x,tri1.p[1].y);
		System.out.printf("%d %d%n",tri1.p[2].x,tri1.p[2].y);
		System.out.println(tri1.color);
		
		System.out.println(tri1);
	}

	public static void exam_circle() {
		Circle c1 = new Circle();
		
		System.out.println(c1.center.x);  // c1의 센터의 x확인.
		System.out.println(c1.center.y);
		System.out.println(c1.r);
		
		Point center = new Point(100,100);
		Circle c2 = new Circle(center,150);
		System.out.println(c2.center.x);  // c1의 센터의 x확인.
		System.out.println(c2.center.y);
		System.out.println(c2.r);
	}

}
