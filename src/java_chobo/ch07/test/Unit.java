package java_chobo.ch07.test;

public abstract class Unit {

	int x;
	int y;

	void move(int x, int y) {
		System.out.println("지정된 위치로 이동");

	}

	void stop() {
		System.out.println("현재 위치에 정지");
	}

}
