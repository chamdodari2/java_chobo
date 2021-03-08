package java_chobo.ch07;

interface MyInterface {
	default void method1() {
		System.out.println("methode1() in MyInterface");
	}

	default void method2() {
		System.out.println("methode2() in MyInterface");
	}
	
	static void staticMethod() {
		System.out.println( "staticmethode() in MyInterface");
	}
}
