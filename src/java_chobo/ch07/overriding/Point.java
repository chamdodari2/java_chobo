package java_chobo.ch07.overriding;

public class Point {
	
	private int x;
	private int y;
	
	// final 을 붙이면 자손이 오버라이딩 할수 없다.
	// 접근지정 범위 private < default(package) < protected(상속관계면 다른패키지여도 허용) < public 
	 String getLocation() {
		return String.format("x = %d, y = %d%n", x, y);
	}

}
