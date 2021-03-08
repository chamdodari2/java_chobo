package java_chobo.ch07;

interface  MyInterface2 {
	default void method1() {
		System.out.println("method1() int MyInterface2");
	}
	static void staticMethod() {
		System.out.println("staticMethod() int MyInterface2");
	}
}
