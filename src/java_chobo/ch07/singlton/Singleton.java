package java_chobo.ch07.singlton;

public class Singleton { //외부에서 new 하지 않도록 private와 final을 이용해 막은것
	private static final Singleton insteance = new Singleton();   //자기자신을 만든것

	
	
	private Singleton() { //생성자도 private로 해주어야 외부에서 new로 생성하지 못하게 막을 수 있다. 그래야 싱글턴패턴이다.
	
	}

//////////////////////////////////

	public static Singleton getInteance() {  //외부에서는 이제 얘만 호출할수 있다. 생성해놓은 in
		return insteance;
	}

}
