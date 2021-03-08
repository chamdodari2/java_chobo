package java_chobo.ch09; // Cloneble을 이용한 복제

class Circle implements Cloneable {
	Point p;
	double r;

	public Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}

	@Override
	protected Object clone() {
		Object obj = null;

		try {
			obj = super.clone(); // 자기자신만 복제한거임. 여기에다가
			Circle c = (Circle) obj; // 이 두줄 추가해야만 따로따로 생성된다
			// c.p = new Point(this.p.x, this.p.y); //(Point의 p.x, p.y의 값을 c.p에 복제??)넘어온 값을 ㅇㅇ... 이것도 귀찮으면 아래방법으로
			c.p = (Point) this.p.clone(); // 자기자신이 포인트여서 밑에있는거 호출.. 복잡하면 걍 버리기
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;

	}
}

public class Point implements Cloneable {

	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("Point [x=%s, y=%s]", x, y);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = null;

		try {
			obj = super.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Point p1 = new Point(3, 4);
		// Point cpP1 = (Point) p1.clone();
		System.out.println(p1);
		// System.out.println(cpP1);

		Circle c1 = new Circle(p1, 3);
		Circle c2 = (Circle) c1.clone();
		System.out.println(System.identityHashCode(c1));
		System.out.println(System.identityHashCode(c2));
		System.out.println(System.identityHashCode(c1.p));
		System.out.println(System.identityHashCode(c2.p));

	}
}
