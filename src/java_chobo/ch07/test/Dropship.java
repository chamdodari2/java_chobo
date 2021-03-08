package java_chobo.ch07.test;

public class Dropship extends Unit {
// Tank tank = new Tank();
	
	@Override
	void move(int x, int y) {

	}
	void load() {
		System.out.println("선택된 대상을 태운다");
	}
	
	void unload() {
		System.out.println("선택된 대상을 내린다");
	}

}
