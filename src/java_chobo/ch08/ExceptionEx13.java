package java_chobo.ch08;

import javax.management.RuntimeErrorException;

public class ExceptionEx13 { // 언체크익셉션 :자동전파된다. 그래도 최종에는 묶어주야한다.

	public static void main(String[] args) {
		try {
			method1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void method1() {
		method2();

	}

	private static void method2() {
		throw new RuntimeException("런타임 익셉션 발생");

	}

}
