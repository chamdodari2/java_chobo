package java_chobo.ch07.ab;

public class SuvAbstractTest extends AbstractTest {  //미완성된 조상을 당겨쓸거면 네가 완성하거나 너도 추상클래스로 선언하렴 하고 빨간줄이 뜬다. 완성하겠다고 하면 오버라이딩 부분이 생긴다

	//자손이 재정의해서 쓸거면 어차피 조상 메소드는  선언만 당겨쓰고 바디는 그대로 안쓰니까 미오나성
	
	public static void main(String[] args) {
		SuvAbstractTest sat = new SuvAbstractTest();
		sat.prnTest2();
		
		 AbstractTest sat1 = new SuvAbstractTest();
		 sat1.prnTest2();
	}
	
	
	@Override
	public void prnTest() {
		System.out.println("Subtest2");
	}

	

	@Override
	void prnTest2() {
		System.out.println("subtest2");
		
	}
}
